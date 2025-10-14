package oopTest.cond.ex;

public class MoveRateEx {
    public static void main(String[] args) {
        // 평점에 따른 영화 추천
        // rating 이상 평점의 영화 추천

        double rating = 7;

        if (rating <= 9){
            System.out.println("'어바웃타임'을 추천 합니다.");
        }if (rating <= 8){
            System.out.println("'토이스토리'를 추천 합니다.");
        }if (rating <= 7){
            System.out.println("'고질라'를 추천 합니다.");
        }
    }
}
