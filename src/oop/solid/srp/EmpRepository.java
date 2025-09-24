package oop.solid.srp;

public class EmpRepository {

    public void saveToDatabase(Employee emp) {
        // 데이터베이스 저장 로직이 여기 존재함
        // DB 연결, SQL 쿼리 작성 및 실행 등...
        System.out.println(emp + "직원의 정보를 DB에 저장했습니다.");
    }
}
