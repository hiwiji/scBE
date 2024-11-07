package exercise.chapter_57;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        // TODO : 1. 서버 소켓 생성
        // TODO : 1-1 클라이언트 접속 대기

        try (ServerSocket serverSocket = new ServerSocket(1234) ) { // 1. 서버 소켓 생성
            Socket clientSocket = serverSocket.accept(); // 1-1 클라이언트 접속 대기

            System.out.println("서버가 시작되었습니다.");
            System.out.println("클라이언트가 접속하였습니다.");

            // TODO : 2. 클라이언트로부터 데이터를 받기 위한 InputStream 생성
            InputStream clientInputstream = clientSocket.getInputStream();

            // 기존스트림은 byte기 때문에 문자열로 받기 위해서
            // InputStreamReader는 원래 (byte로 받던거, 그냥 한국어 보내면 깨짐) clientInputsteam을 보조함
            // 보조한걸 다시 BufferReader로 보조스트림으로 넣어 속도를 더 빠르게한다.
            BufferedReader clientBufferedReader = new BufferedReader(new InputStreamReader(clientInputstream));

            // TODO : 2-1 클라이언트로 데이터를 보내기 위한 OutputStream 생성
            OutputStream serverOutputStream = clientSocket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(serverOutputStream, true);
            // 나가는건 속도보다 사용성 중시
            // serverOutputStream을 보조스트림인 PrintWriter로 감싸줌


            // inputLine;
            String inputLine;

            // TODO : 3. 클라이언트로부터 데이터를 읽고 화면에 출력

            // inputLine은 다 읽고나면 마지막에 null이 뜸. null = 종료신호
            while((inputLine = clientBufferedReader.readLine()) != null) {
                System.out.println("클라이언트로 부터 온 요청은 " + inputLine);

                // TODO : 클라이언트에게 응답을 보냄
                printWriter.println("서버로부터 응답이 왔습니다.");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
