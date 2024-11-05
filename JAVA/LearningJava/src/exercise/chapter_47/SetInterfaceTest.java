package exercise.chapter_47;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceTest {

    public static void main(String[] args) {
        // Set 인터페이스 구현
        Set <String> fruitSet = new HashSet<>();

        // 1. add : set 요소 추가
        fruitSet.add("Orange");
        fruitSet.add("Apple");
        fruitSet.add("Mango");
        fruitSet.add("Grape");

        System.out.println("fruitSet : " + fruitSet); //  [Apple, Grape, Mango, Orange]

        // 1-1 add 중복 add 안되는거
        fruitSet.add("Apple");
        System.out.println("fruitSet : " + fruitSet); //  [Apple, Grape, Mango, Orange]
//        fruitSet.add("Melon");
//        System.out.println("fruitSet : " + fruitSet); // [Apple, Grape, Mango, Orange, Melon]
        // List는 중복값도 들어감. Set은 중복값 안들어감

        // 2. remove(set) :set 요소 삭제
        fruitSet.remove("Apple");
        System.out.println("fruitSet : " + fruitSet); // [Grape, Mango, Orange]

        // 3. contains : set에 요소 존재유무를 boolean으로 확인
        System.out.println("Apple 있는지 : " + fruitSet.contains("Apple")); // false
        System.out.println("Mango 있는지 : " + fruitSet.contains("Mango")); // true

        // 4-6 size, isEmpty, Clear
        System.out.println("사이즈: " + fruitSet.size());

        fruitSet.clear(); // 삭제확인
        System.out.println("Set이 비었는지? : " + fruitSet.isEmpty()); //  true
        System.out.println("fruitSet : " + fruitSet); // 없어요

    }
}
