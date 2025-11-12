package oopTest.array.ex;

import java.util.Scanner;

public class ProductAdminEx2 {
    public static void main(String[] args) {

        int maxProducts = 10;   // 상품등록 최대 개수
        String[] productNames = new String[maxProducts];    // 이름 10개
        int[] productPrices = new int[maxProducts]; // 가격 10개
        int productCount = 0;   // 현재 등록된 상품 개수

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요: ");
        }


    }
}
