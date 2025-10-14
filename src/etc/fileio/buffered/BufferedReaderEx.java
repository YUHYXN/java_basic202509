package etc.fileio.buffered;

import etc.fileio.FileExample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

    public static void main(String[] args) {

        try(BufferedReader br
                    = new BufferedReader(new FileReader(FileExample.ROOT_PATH + "/bout.txt"))){

            // readLine() : 한 줄을 통째로 읽어서 String으로 반환 해준다.
            // 더이상 읽어들일 데이터가 없다면 null을 리턴
            String str;
            while((str = br.readLine()) != null){
                System.out.println(str);
            }


            } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
