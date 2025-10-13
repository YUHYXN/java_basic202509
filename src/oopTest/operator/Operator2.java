package oopTest.operator;

public class Operator2 {
    public static void main(String[] args) {
        // 문자열 더하기

        String str1 = "Hello, ";
        String str2 = "World!";
        String result = str1 + str2;
        System.out.println(result); // 출력: Hello, World!

        // 문자열과 다른 타입 더하기
        String str3 = "The answer is ";
        int answer = 42;
        String combined = str3 + answer;
        System.out.println(combined); // 출력: The answer is 42 - int가 String으로 변환되어 더해짐
    }
}
