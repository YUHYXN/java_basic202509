package oopTest.loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 2;
        int count = 1;

        while (count <= 10) {   // 10인 이유는 10개를 출력해야해서 10번 반복해야하니까
            System.out.println(num);
            num +=2;  // num = num + 2; 이건 짝수 출력하는거
            count++;    // 이건 반복 횟수 세는거
        }
    }
}
