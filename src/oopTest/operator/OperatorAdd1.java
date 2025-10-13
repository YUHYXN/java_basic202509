package oopTest.operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        // 증감 연산자

        int a = 0;
        a = a + 1; // 1
        System.out.println("a = " + a); // 1 출력

        a = a + 1; // 2
        System.out.println("a = " + a); // 2 출력


        ++a; // a = a + 1; 이랑 같음
        System.out.println("a = " + a); // 3 출력
        ++a; // a = a + 1; 이랑 같음
        System.out.println("a = " + a); // 4 출력

        --a; // a = a - 1; 이랑 같음
        System.out.println("a = " + a); // 3 출력

        /*
        전위, 후위 증감연산자
        증감 연산자는 피연산자 앞에 두거나 뒤에 둘 수 있으며, 연산자의 위치에 따라 연산이 수행되는 시점이 달라진다.
        `++a` : 증감 연산자를 피연산자 앞에 둘 수 있다. 이것을 앞에 있다고 해서 전위(Prefix) 증감 연산자라 한다.
        `a++` : 증감 연산자를 피연산자 뒤에 둘 수 있다. 이것을 뒤에 있다고 해서 후위(Postfix) 증감 연산자라 한다.
         */


    }
}
