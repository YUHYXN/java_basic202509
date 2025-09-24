package oop.solid.srp;

public class PayCalculator {

    public long calculatePay(Employee e) {
        // 복잡한 급여 계산 로직이 여기 존재함
        // 세금계산 보너스계산 연차 반차 체크....
        return e.getBaseSalary(); // 예시로 기본급여만 반환
    }
}
