package oopTest.operator;

public class Assign1 {
    public static void main(String[] args) {

        // 대입 연산자

        int a = 5;
        a += 3; // a = a + 3; 과 동일  8 - a에 3을 +하고 a에 다시 대입해라(=)
        a -= 2; // a = a - 2; 과 동일 6
        a *= 4; // a = a * 4; 과 동일 24
        a /= 3; // a = a / 3; 과 동일 8
        a %= 5; // a = a % 5; 과 동일 3
        // 지금 위에서부터 쭉 산수가 연결되는거임 ㅇㅇ
        System.out.println("a = " + a); // 8 출력


    }
}
