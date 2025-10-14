package etc.fileio.objstream;

import etc.fileio.FileExample;
import org.ietf.jgss.GSSName;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class SaveSnack {
    public static void main(String[] args) {

        // 과자 정보를 텍스트로 파일에 저장하는 게 아니라
        // 객체를 통채로 바이너리 상태로 세이브 파일에 넣어버리기
        // 나중에는 객체 형태를 JSON 형태로 변경해서 텍스트 형태로 저장하는 것도 가능 (나중에)
        List<Snack> snackList = List.of(
                new Snack("갈릭프레즐", 1999, 1700, Snack.Taste.GOOD),
                new Snack("맛동산", 1978, 1700, Snack.Taste.GOOD),
                new Snack("씨리얼 초코", 2001, 2100, Snack.Taste.BAD)
        );

        try(ObjectOutputStream oos
                    = new ObjectOutputStream(new FileOutputStream(FileExample.ROOT_PATH + "/snack.sav"))) {

            oos.writeObject(snackList);
            System.out.println("객체 저장 성공!");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
