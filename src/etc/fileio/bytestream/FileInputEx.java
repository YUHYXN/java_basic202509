package etc.fileio.bytestream;

import etc.fileio.FileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputEx {
    public static void main(String[] args) {

//        FileInputStream fis = null; <- 이제 미리 선언 안 해도 됨 try 옆에 () 넣고 지웠음

        // try ~ with ~ resources : 메모리 정리가 필요한 객체에 대해 자동 Close 처리 (자바 8 이상)
        // try () 안에 객체 생성 문법 쓰기 그럼 finaly를 안 써도 된다.
        // 자동 Close 대상 객체가 closeable의 구현체여야 한다.

        try (FileInputStream fis
                     = new FileInputStream(FileExample.ROOT_PATH + "/hello.txt")) {
            while(true){    // 무한루프
                int data = fis.read();  // 1byte 단위로 읽기
                System.out.print((char)data);   // int -> char 형 변환 | 숫자형을 문자형으로 변환 출력
                if(data == -1) break; // read() 메서드가 더 이상 읽을 데이터가 없으면 -1을 반환
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
