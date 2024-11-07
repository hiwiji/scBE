package exercise.chapter_57;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public static void main(String[] args) {
        // TODO : 1. 서버에 연결
        // 소켓 생성하기
        // host 의 "localhost"는 내컴퓨터 자신, 다른사람 컴퓨터라면 그 컴퓨터 ip주소 입력
        // port의 숫자는 서버의 숫자와 동일해야함.
        try(Socket socket = new Socket("localhost", 1234)) { // 서버연결
            // 클라이언트는 이미 준비가 되있는 서버에 요청만 바로 하면 되기 때문에, 접속대기 필요 없음

            // TODO : 2. 서버로 데이터를 보내기 위한 OutputStream 생성
            // autoFlash : 이 스트림을 한번 비우는 과정. 이거 안하면 오류남
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter clientPrintWriter = new PrintWriter(outputStream, true);

            // TODO : 2-1 서버로부터 데이터를 받기 위한 InputStream 생성
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            // TODO : 3. 서버에 메시지 전송
            clientPrintWriter.println("ID114, 유기현");

            // TODO : 4. 서버로부터 받은 응답 출력
            String response = bufferedReader.readLine();
            System.out.println("서버의 응답(고객대기리스트): " + response);

            System.out.println("Client가 종료되었습니다.");

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }





    }

}
