package etc.fileio.bytestream;

import etc.fileio.FileExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("파일명: ");
        String fileName = sc.next();    // 문자열(공백 ❌)

        FileOutputStream fos = null;


        // 바이트 기반 출력 스트림 - 1바이트 단위로 데이터 처리
        // 주로 이미지, 영상 같은 바이너리 데이터에 적합
        // 빨간 줄로 처리되지 않는 예외 뜨면 트라이캐치로 둘러싸기
        try {
            fos = new FileOutputStream(FileExample.ROOT_PATH + "/" + fileName + ".txt");
            System.out.println("문장을 입력하세요: ");
            sc.nextLine();  // 위에 파일명 작성 후 엔터 입력값 처리해야함 || 아니면 입력이 갑자기 확 종료 됨
            String str = sc.nextLine(); // 문자열(띄어쓰기 ⭕) - 공백이 생길 것 같은 것은 nexLine();으로 해주자

            byte[] arr = str.getBytes();    // 문자열 데이터를 바이트 배열로 변환
            fos.write(arr); // 파일을 바이트 단위로 써 내린다.


        } catch (Exception e) {
            e.printStackTrace();

        }finally {
            // 스트림을 더 이상 사용하지 않는 경우
            // 시스템 자원을 반납하는 코드를 작성하는 것을 권장한다.

            try {
                fos.close();
                sc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }
}
