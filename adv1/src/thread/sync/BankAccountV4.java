package thread.sync;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountV4 implements BankAccount {

  private int balance;
  private final Lock lock = new ReentrantLock();

  public BankAccountV4(int initialBalance) {
    this.balance = initialBalance;
  }

  @Override
  public boolean withdraw(int amount) {
    log("거래 시작: " + getClass().getSimpleName());

    lock.lock(); //ReentrantLock 이용하여 lock

    try {
      log("[검증 시작] 출금액: " + amount + ", 잔액: " + balance);
      if (balance < amount) {
        log("[검증 실패]");
        return false;
      }

      log("[검증 완료] 출금액: " + amount + ", 잔액: " + balance);
      sleep(1000); //출금에 걸리는 시간으로 가정
      balance -= amount;
    } finally {
      lock.unlock(); //무조건 lock 해제해야함
    }

    log("거래 종료");
    return true;
  }

  @Override
  public int getBalance() {
    lock.lock();
    try {
      return balance;
    } finally {
      lock.unlock();
    }
  }
}
