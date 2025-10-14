package etc.fileio;

import java.io.File;
import java.io.IOException;

public class FileExample {

    // 파일을 저장할 경로 (자주 써야함)
    // public static final String ROOT_PATH = "저장소경로";
    public static final String ROOT_PATH = "/Users/milk/Desktop/Codeit-7th-develop/FileUploadEx/";


    public static void main(String[] args) {


        // 폴더 생성 명령
        // 1. 생성할 폴더의 경로를 파일 객체로 매핑한다.
        File file = new File(ROOT_PATH);

        // 2. 폴더 생성 명령을 내려준다.
        if(!file.exists()){ // 만약 file이 존재하지 않는다면.
            file.mkdir();   // 생성해야 할 폴더 경로가 하나일 때
//            file.mkdirs(); 생성해야 할 폴더 경로가 여러 개일 때
        }

        // 3. 파일 생성하기
        // 3-1. 파일이 저장될 경로와 파일명을 함께 파일 객체로 매핑
        File newFile = new File(ROOT_PATH + "/food.txt");
        if (!newFile.exists()){
            try {
                newFile.createNewFile();
                System.out.println("파일이 생성되었습니다.");
            } catch (IOException e) {
                System.out.println("파일 생성 실패");
                e.printStackTrace();
            }

        }

    }
}
