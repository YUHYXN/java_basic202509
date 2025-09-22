package Sprint.Ms1;

public class StarPattern {
    public static void main(String[] args) {
        // 별을 이용해 다음과 같은 패턴을 출력
        // 출력예시 아래
        //*
        //**
        //***
        //****
        //*****
        //******
        //*****
        //****
        //***
        //**
        //*

        int n = 6; // 별이 가장 많은 줄의 별 개수 (여기서는 6개)

        // 위쪽 삼각형 (1개부터 n개까지 별을 늘려서 출력)
        for (int i = 1; i <= n; i++) {        // i는 줄 번호 (1 ~ n)
            for (int j = 1; j <= i; j++) {    // j는 현재 줄에서 출력할 별 개수
                System.out.print("*");        // 별 출력 (줄바꿈 없이)
            }
            System.out.println();             // 한 줄이 끝나면 줄바꿈
        }

        // 아래쪽 삼각형 (n-1개부터 1개까지 별을 줄여서 출력)
        for (int i = n - 1; i >= 1; i--) {    // i는 줄 번호 (n-1 ~ 1)
            for (int j = 1; j <= i; j++) {    // j는 현재 줄에서 출력할 별 개수
                System.out.print("*");        // 별 출력
            }
            System.out.println();             // 줄바꿈
        }

    }
}
