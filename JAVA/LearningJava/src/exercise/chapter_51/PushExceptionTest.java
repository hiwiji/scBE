package exercise.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PushExceptionTest {

    public static void main(String[] args) {

        try {
            printFile("src/exercise/chapter_51/test.txt");
            // 여기  빨간줄 뜬 이유.... 아래서 예외처리 안해줘서
            // try-catch문을 통해 메인메소드에서 다 해주기
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    
    // 출력메소드 // 2. InputStream을 부른 얘가 받음(getFileStream)했으니까
    // 3. 2에서 받은거 그대로 다시 또 보내고, read()에서 나온 IOException도 미루기
    static void printFile(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fs = getFileStream(fileName);

        int i;

        while((i = fs.read()) != -1) {
            System.out.write(i);

        }

    }


    // 1. 얘가 던지고 FileInputStream에 관련된 오류처리 미뤄서 던지고
    static FileInputStream getFileStream(String filename) throws FileNotFoundException {
        FileInputStream fs = new FileInputStream(filename);
        return fs;
    }
}

