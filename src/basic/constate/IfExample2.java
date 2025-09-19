package basic.constate;

public class IfExample2 {
    public static void main(String[] args) {
        int age = 35;

        if (age >= 20) {
            // System.out.println("성인 입니다.");
            // 중첩 if 문
            if (age < 40){
                System.out.println("청년 입니다.");
            } else if (age < 65) {
                System.out.println("중년 입니다.");
            } else {
                System.out.println("노년 입니다.");
            }
        }else if (age >= 17) {
            System.out.println("고등학생 입니다.");
        } else if (age >= 14) {
            System.out.println("중학생 입니다.");
        } else if (age >= 8) {
            System.out.println("초등학생 입니다.");
        } else {
            System.out.println("미취학 입니다.");
        }
    }
}
