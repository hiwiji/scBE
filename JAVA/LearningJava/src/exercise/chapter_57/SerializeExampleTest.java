package exercise.chapter_57;

import java.io.*;

public class SerializeExampleTest {

    public static void main(String[] args) {
        // 직렬화 : 알수없는 문자가 나옴, 우리는 알아볼 수 없지만 컴퓨터는 알아보기 쉬운 상태
        // 1. 객체생성
        Person person = new Person("이순신", "Male", 30, "Korea", "장수");


        byte[] serializedData = null;

        // 2. try-catch 해주기
        try (ByteArrayOutputStream bao = new ByteArrayOutputStream();

             // 3.ObjectOutputStream 써주기.
             // 보조스트링 중 하나로 ByteArray를 보조해주는것
             ObjectOutputStream objectOutStream = new ObjectOutputStream(bao);

        ) {
            // 4.
            objectOutStream.writeObject(person);
            objectOutStream.flush();

            serializedData = bao.toByteArray();
            System.out.println("Person 직렬화 후: " + new String(serializedData));

        } catch (IOException e) {
            e.printStackTrace();
        }


        // 역직렬화 중
        try (ByteArrayInputStream bio = new ByteArrayInputStream(serializedData);
             ObjectInputStream objectInputStream = new ObjectInputStream(bio);
        ){
            Person person1 = (Person) objectInputStream.readObject(); // 기본이 object라 다운캐스팅
            System.out.println("직렬화 된 Data가 다시 Person 역직렬화 후: " + person1);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
