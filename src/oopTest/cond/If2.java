package oopTest.cond;

public class If2 {
    public static void main(String[] args) {

        // 나이에 따른 조건문 작성
        // 이건 if문으로만 작성되어 있어서 비효율적임
        // if - else if - else 문으로 작성하는게 더 효율적임
        // 그러나, 각각 수행되어야 하는 경우에는 if문으로 작성하는게 맞음

        int age = 14;

        if(age <= 7){
            System.out.println("미취학 아동");
        }
        if(age >= 8 && age <= 13){
            System.out.println("초등학생");
        }
        if(age >= 14 && age <= 16){
            System.out.println("중학생");
        }
        if(age >= 17 && age <= 19){
            System.out.println("고등학생");
        }
        if(age >= 20){
            System.out.println("성인");
        }
    }
}
