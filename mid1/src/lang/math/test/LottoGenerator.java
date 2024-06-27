package lang.math.test;

import java.util.Random;

public class LottoGenerator {

  public static void main(String[] args) {
    int[] lottoNums = getLottoNums();

    System.out.print("로또 번호 : ");

    for (int lottoNum : lottoNums) {
      System.out.print(lottoNum + " ");
    }
  }

  public static int[] getLottoNums() {
    int[] nums = new int[6];
    Random random = new Random();

    for (int i = 0; i < nums.length; i++) {
      while (true) {
        int value = random.nextInt(45) + 1;
        if (!isContains(value, nums)) {
          nums[i] = value;
          break;
        }
      }
    }
    return nums;
  }

  public static boolean isContains(int num, int[] nums) {
    for (int i : nums) {
      if (i == num) {
        return true;
      }
    }
    return false;
  }
}
