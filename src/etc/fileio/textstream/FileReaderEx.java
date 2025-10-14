package etc.fileio.textstream;

import etc.fileio.FileExample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

    public static void main(String[] args) {

        try (FileReader fr = new FileReader(FileExample.ROOT_PATH + "/merong.txt")) {

//            fr.read();    한 글자씩 읽어들임
            char[] arr = new char[100]; // 문자 100개를 저장할 수 있는 배열
            int result = fr.read(arr);// 배열 크기만큼 문자 데이터를 한 번에 읽어들임
            System.out.println("문자의 개수: " + result);

            for (char c : arr) {    // 이터?
                System.out.print(c);
                if(c == 0) break; // 만약에 C가 0이면 멈춰
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}