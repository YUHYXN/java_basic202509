package oopTest.loop.ex;

import java.util.jar.JarEntry;

public class NestedEx1 {
    public static void main(String[] args) {
        // 구구단
        // 1 * 1 = 1
        // 1 * 2 = 2
        // ....
        // 9 * 9 = 81

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
    }
}
