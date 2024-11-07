package exercise.chapter_56;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

    public static void main(String[] args) {

        String content = "This is content of File3";
        // 파일 만들기
        try(FileOutputStream fos
            = new FileOutputStream("src/exercise/chapter_56/output2.txt", true)) {

            byte[] bytes=content.getBytes();
            // write는 바이트 단위로 출력해야함.
            fos.write(bytes);

            System.out.println("txt파일이 생성되었습니다.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }


    }
}
