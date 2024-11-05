package exercise.chapter_46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterfaceTest {

    public static void main(String[] args) {
        // 0. List 정의
        List<String> fruitList = new ArrayList<>();
        // ArrayList 객체로 리스트라는 타입의 fruitList 를 정의함

        // 1. add : 리스트 끝에 순서대로 추가
        fruitList.add("Orange");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Kiwi");

        System.out.println("FruitList 요소 :" + fruitList);

        // 2. add(index, element) : 특정 위치에 요소 추가
        // 바나나와 키위 사이에 망고 추가하기
        // 사이에 추가할 때 위치는 [<0위치> Orange,<1위치> Apple, <2> Banana, <3>임 Kiwi]
        fruitList.add(3, "Mango");
        System.out.println("FruitList 요소 :" + fruitList);

        // 3. remove(index) : 특정 위치에 요소 제거
        // 추가한 망고를 빼라
        // 현재 위치를 적어주면 됨
        fruitList.remove(3);
        System.out.println("FruitList 요소 :" + fruitList);

        // 4. get(Index) : 특정 요소 반환(가져오기)
        // 키위를 가져와라
        String myFruit = fruitList.get(3);
        System.out.println("가져온 과일은 : " + myFruit);

        // 5. set(Index, Element) : 지정된 인덱스의 요소를 새로운 요소로 대체
        // 사과를 파인애플로 변경하기
        fruitList.set(1,"PineApple");
        System.out.println("FruitList 요소 :" + fruitList);

        // 6. size 리스트 : 현재 리스트 배열크기
        System.out.println("리스트사이즈 : " + fruitList.size());

        // 7. isEmpty : 현재 리스트 비어있는지 확인
        List <String> fruitList2 = new ArrayList<>();
        System.out.println(fruitList2.isEmpty()); // 아무것도 안넣었으니까 true
        System.out.println(fruitList.isEmpty()); // 리스트4개 있으니까 false

        // 8. Contains : 리스트에 해당 원소가 있는지 없는지 확인하는 메서드
        System.out.println(fruitList.contains("Kiwi")); // 리스트에 있으니까 true
        System.out.println(fruitList.contains("Apple")); // 리스트에 없으니까 false

        // 9. IndexOf : 해당요소가 몇번째 자리에 있는지 숫자로 반환, 없으면 -1
        String myFruit2 = "Orange";
        System.out.println(fruitList.indexOf(myFruit2)); // 0번째에 있으니까 0
        String myFruit3 = "Apple";
        System.out.println(fruitList.indexOf(myFruit3)); // 없으면 -1로 뜸

        // 10. Clear : 리스트의 모든 요소 제거
        fruitList.clear();
        System.out.println("FruitList 요소 :" + fruitList);



    }

}
