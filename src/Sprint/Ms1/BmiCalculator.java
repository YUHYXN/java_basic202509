package Sprint.Ms1;

public class BmiCalculator {
    public static void main(String[] args) {
        // 03. BMI 계산히기
        // 사용자의 키(height, 실수)와 몸무게(weight, 실수)를 변수에 저장하고, BMI를 계산하여 출력하는 프로그램을 작성하세요.
        // 키는 1.75m 몸무게는 70.0kg
        // 키: 1.75m
        //몸무게: 70.0kg
        //BMI: 22.857142857142858
        double height = 1.75;
        double weight = 70.0;
        //BMI = 몸무게(kg) / (키(m) * 키(m))
        double bmi = weight / (height * height);
        System.out.println("키: " + height + "m");
        System.out.println("몸무게: " + weight + "kg");
        System.out.println("BMI: " + bmi);
    }
}
