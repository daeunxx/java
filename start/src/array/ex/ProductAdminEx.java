package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        while (true) {
            System.out.println("1 : 상품 입력, 2 : 상품 목록, 3 : 프로그램 종료");
            int option = scanner.nextInt();

            if (option == 1){
                if (productCount >= maxProducts) {
                    System.out.println("상품을 더 이상 등록할 수 없습니다.");
                    continue;
                }
                scanner.nextLine();

                System.out.print("상품명을 입력하세요 : ");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요 : ");
                productPrices[productCount++] = scanner.nextInt();
            } else if (option == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + " : " + productPrices[i] + "원") ;
                }
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
