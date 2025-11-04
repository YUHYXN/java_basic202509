package oopTest.array;

public class EnhancedFor1 {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        // iter 이라고 치면 향상된 for문 자동완성
        // 사용할 수 없는 경우는 하나다

        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println("number: " + number);
        }

        System.out.println("-------------------");

        // 향상된 for문
        for (int number : numbers) {
            System.out.println("number: " + number);
        }

        // for-each문은 인덱스 값을 사용할 수 잆음
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }
    }
}
