package oop.solid.srp;


// 오직 직원의 정보를 담는 책임지자
// 계산이나 저장은 다른 클래스가 담당
// SRP 단일 책임 원칙에 위배되지 않음
// DTO 또는 도메인 객체라고 한다.
public class Employee {

    private String name;
    private long baseSalary;

    public Employee(String name, long baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
    }

    // 책임1. 직원 월급 계산


    // 책임2. 직원 정보를 데이터베이스에 저장

}
