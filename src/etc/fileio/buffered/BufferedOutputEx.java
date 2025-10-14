package etc.fileio.buffered;

import etc.fileio.FileExample;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputEx {


    public static void main(String[] args) {
        // dummy data
        StringBuilder text = new StringBuilder();

        for (int i = 0; i <= 10000000; i++) {
            text.append(i + "안녕하세요\n");
        }

        long start = System.currentTimeMillis();

        try(FileOutputStream fos
                    = new FileOutputStream(FileExample.ROOT_PATH + "/bout.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos)){
            // BufferedOutputStream : 버퍼(임시 저장 공간)을 이용해서 데이터를 모았다가 한 번에 출력
            // buffered를 쓰려면 FileOutputStream이 필요함 왜냐하면 FileOutputStream이 없으면 파일을 못 만듦

            byte[] data = new String(text).getBytes();// String -> byte[]
            bos.write(data);    // fos -> bos 수정


        } catch (Exception e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("소요시간: " + (end - start)  * 0.001 + "초");

    }

}
