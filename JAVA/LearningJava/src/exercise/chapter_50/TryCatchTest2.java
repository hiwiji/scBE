package exercise.chapter_50;

import java.util.ArrayList;
import java.util.List;

public class TryCatchTest2 {

    public static void main(String[] args) {

        System.out.println("메인메소드 실행합니다.");

        List<String> stringList = new ArrayList();

        stringList.add("Hello");
        stringList.add("World");
        stringList.add("I");
        stringList.add("Love");
        stringList.add(null); // null은 toUpperCase 실행x
        stringList.add("Coding");


        for (int i=0; i < stringList.size() + 5; i++ ) {
            try {
                System.out.println("i: " + i);
                String str = stringList.get(i);
                System.out.println(str.toUpperCase());
            } catch (NullPointerException e) {
                System.out.println("null은 들어갈 수 없습니다.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index는 Array Bound 넘어갈 수 없습니다.");
                break;
            }
        }

        System.out.println("메인메소드 종료합니다.");
    }
}
