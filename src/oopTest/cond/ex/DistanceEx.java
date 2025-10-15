package oopTest.cond.ex;

public class DistanceEx {
    public static void main(String[] args) {

        // 거리에 따른 교통수단 추천
        // 기본적으로 else-if는 조건문이기 때문에 한가지 수만 발동함.

        int distance = 25;

        if (distance <= 1) {    // 1km 이내라면,
            System.out.println("도보를 이용하세요.");

        } else if (distance <= 10) {    // 10km 이내라면,
            System.out.println("자전거를 이용하세요.");

        } else if (distance <= 100) {   // 100km 이내라면,
            System.out.println("자동차를 이용하세요.");

        } else {    // 100km 이상이라면,
            System.out.println("비행기를 이용하세요.");

        }
    }
}
