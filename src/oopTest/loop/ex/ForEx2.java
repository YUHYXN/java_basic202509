package oopTest.loop.ex;

public class ForEx2 {
    public static void main(String[] args) {

        int num = 2;

        for (int count = 1; count <= 10; count++) {
            System.out.println(num);
            num +=2; // num = num + 2; 이건 짝수 출력하는거 2씩 더해라. (짝수니까)
        }
    }
}
