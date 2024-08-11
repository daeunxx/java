package thread.sync;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountV6 implements BankAccount {

  private int balance;
  private final Lock lock = new ReentrantLock();

  public BankAccountV6(int initialBalance) {
    this.balance = initialBalance;
  }

  @Override
  public boolean withdraw(int amount){
    log("거래 시작: " + getClass().getSimpleName());

    try {
      if (!lock.tryLock(2000, TimeUnit.MILLISECONDS)) {
        log("[진입 실패] 이미 처리 중인 작업 존재");
        return false;
      }
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

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
