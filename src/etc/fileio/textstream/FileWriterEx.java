package etc.fileio.textstream;

import etc.fileio.FileExample;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {
        try (FileWriter fw
                     = new FileWriter(FileExample.ROOT_PATH + "/merong.txt")) {
            String str = "자바 파일 입/출력을 공부하는 중 입니다.\r\n오늘은 화요일입니다.\r\n왜금요일이 아니지??";

            fw.write(str);  // 문자열 데이터를 파일에 써 내린다.

            System.out.println("파일이 정상적으로 작성되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
