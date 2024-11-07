package exercise.chapter_56;

import java.io.IOException;

public class ConsoleTest {

    public static void main(String[] args) {
        // Console System.in 외부에서 입력스트림 받을 때

        int i =0;

        System.out.println("입력값을 넣어주세요.");
        try {
            StringBuilder sb = new StringBuilder();
            while( (i = System.in.read() ) != '\n') {
                sb.append( (char) i);
            }

            System.out.println("String 출력 : " + sb);

        } catch (IOException e) {
           e.printStackTrace();
        }


        System.out.println("i 그대로 출력 : " + (char) i );
    }


}
