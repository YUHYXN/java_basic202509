package oopTest.cond;

public class If3 {
    public static void main(String[] args) {
        // 나이에 따른 조건문 작성
        // if - else if - else 문으로 작성하는게 더 효율적임

        int age = 14;

        if(age <= 7){
            System.out.println("미취학 아동");
        } else if(age <= 13){   // false 8 ~ 13 초등학생
            System.out.println("초등학생");
        } else if(age <= 16){  // true 14 ~ 16 중학생
            System.out.println("중학생");
        } else if(age <= 19){   // 17 ~ 19 고등학생
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
    }
}
