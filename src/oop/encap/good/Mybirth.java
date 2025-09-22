package oop.encap.good;

public class Mybirth {

    // 외부에서 변수에 직접 접근할 수 없도록 필드에 private 접근 제한자 설정
    private int year;
    private int month;
    private int day;

    /*
	 - 정보 은닉은 데이터에 접근 제한을 걸어서 정보를 보호하는 것이 목적이지만
	  private을 설정했더니 데이터 접근 자체가 불가능해집니다.

	 - 따라서 데이터의 유효성을 검증할 수 있는 제어문이 포함된
	  메서드를 사용하여 데이터의 접근을 허용하도록 설계하는데,
	  이 때 사용하는 메서드를 getter / setter 메서드라고 부릅니다.

	  # setter method

	 1. setter는 숨겨진 변수에 값을 저장하기 위한 메서드 입니다.

	 2. 메서드 내부에 데이터 유효성 검증 로직을 작성하여
	  적절한 데이터만 멤버변수에 저장시키고, 접근제한자는
	  public으로 설정하여 외부에서 누구나 사용할 수 있게 합니다.

	 3. 메서드 이름은 일반적으로 set + 필드이름 으로 설정합니다.
	 */

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (year < 1900 || year > 2024) {
            System.out.println("잘못된 년도입니다.");
            return; // return -> 메서드 호출부로 값을 반환 후 메서드 종료 근데 void라 값은 안넘김
        }
        this.year = year;
    }

    // 생성자, getter, setter -> Mac OS 단축키 command + N ******************************
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("잘못된 월 입력입니다.");
            return;
            // 이렇게 해야 여기서 종료되고 아래 코드 실행 안됨
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    /*
	 # getter method

	 1. getter는 숨겨진 변수의 값을 참조할 때 사용하는 메서드입니다.

	 2. setter와 마찬가지로 public제한을 통해 외부에 메서드를 공개하고,
	  이름은 일반적으로 get + 멤버변수이름 으로 지정합니다.
	 */

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            System.out.println("잘못된 일 입력입니다.");
            return;
            // 이렇게 해야 여기서 종료되고 아래 코드 실행 안됨
        }
        // 다시 물어보기
        if (this.month == 0) {
            System.out.println("월을 먼저 설정하세요.");
            return;
        }

        boolean flag = isValidateMonth(day);
//        if (!flag){
        // 이렇게 해도 됨
        if (!isValidateMonth(day)) {
            System.out.println(this.month + "월은 " + day + "일이 없습니다.");
            return;
        }


        this.day = day;
    }

    // 각 월에 맞는 일자가 세팅되어 있는지를 판별하는 메서드 (private)
    // void -> boolean
    private boolean isValidateMonth(int day) {
        switch (this.month) {
            case 2:
                if(day > 28) return false; // 2월은 28일까지라서 28보다 크면 boolean false 반환

            case 4,6,9,11:
                if (day > 30) return false;

            default:
                return true; // 31일까지 있는 달
        }
    }

    void birthInfo() {

        if (year == 0 || month == 0 || day == 0) {
            // 0은 초기값 -> setter에서 유효성 검증 통과 못한 값
            System.out.println("날짜 필드 중에 0이 있습니다. 값을 확인하세요.");
            return; // return -> 메서드 호출부로 값을 반환 후 메서드 종료 근데 void라 값은 안넘김
        }

        System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n", this.year, this.month, this.day);
    }

    // 캡슐화 인캡슐레이션 encapsulation

    /*
	 - 데이터와 데이터를 다루는 여러가지 메서드들을 하나로 묶는 이러한 행위들을
	  캡슐화 라고 합니다. (encapsulation)
	  데이터와 그 데이터를 다루는 로직을 하나로 묶어 쉽게 관리하고 유지 보수하기 위함 입니다.
	 */
}
