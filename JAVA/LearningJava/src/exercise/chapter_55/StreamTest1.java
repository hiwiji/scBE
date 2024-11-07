package exercise.chapter_55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {

    public static void main(String[] args) {

        // Stream.of , Arrays.Stream, collection(=List) -> Stream

        // 1. Stream.of
        Stream<String> fruits = Stream.of("apple", "banana", "orange");
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 2. Arrays.Stream
        Stream<String> fruits2 = Arrays.stream(new String[]{"apple", "banana", "orange"});
        Stream<Integer> integerStream2 = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        // 3. Collection
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");
        fruitsList.add("Mango");
        fruitsList.add("Grapes");

        Stream<String> fruit3 = fruitsList.stream();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);

        Stream<Integer> integerStream3 = integerList.stream();

        // 생성한 stream을 가지고 기존 For-loop에서 Stream 표현하는법
        for (String fruit : fruitsList) {
            System.out.println("for-loop로 fruit 산출 : " + fruit.toUpperCase());
        }

        // Stream
        fruit3.forEach((fruit) -> System.out.println("forEach로 fruit산출: " + fruit.toUpperCase()));

        for (Integer integer : integerList) {
            if (integer % 2 == 0) {
                System.out.println("for-loop로 산출: " + integer);
            } else {
                continue;
            }
        }

        // Stream으로 변경
        integerStream3.filter((i) -> i % 2 == 0)
                .filter((i) -> i > 4)
                .forEach(i -> System.out.println("forEach로 산출 " + i)); // 6, 8, 10


        // Stream은 한번 만들고 나면 재사용 불가 -> 런타임 에러뜸
        // integerStream3.forEach(i -> System.out.println("forEach로 산출 " + i));

        // Stream을 만들기 위한 재료로 썼던 것들은 재사용 가능
        // ex) integerStream3 만들기 위해 integerList 사용한거는 또 사용가능!
        for (Integer integer : integerList) {
            if (integer % 2 == 0) {
                System.out.println("for-loop로 산출2: " + integer);
            } else {
                continue;
            }
        }
    }
}
