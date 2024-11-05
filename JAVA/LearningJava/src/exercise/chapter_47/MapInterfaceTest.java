package exercise.chapter_47;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {

    public static void main(String[] args) {
        // Map 정의
        // 왼쪽이 과일이름, 오른쪽이 과일수량
        Map<String, Integer> fruitMap = new HashMap<>();

        // 1. put : Map에 데이터들을 넣음
        fruitMap.put("Orange", 5);
        fruitMap.put("Apple", 10);
        fruitMap.put("Banana", 3);
        fruitMap.put("Kiwi", 20);

        // 맵은 입력순 == 조회순이 아님. 순서 상관없이 랜덤으로 결과값 나옴
        System.out.println("fruitMap : " + fruitMap); //  {Apple=10, Kiwi=20, Orange=5, Banana=3}

        // 2. get(key) : 키에 대응하는 값 반환. 없으면 null값 반환. 인덱스 사용x
        Integer appleCount = fruitMap.get("Apple");
        Integer bananaCount = fruitMap.get("Banana");

        System.out.println("사과 갯수 : " + appleCount); // 10
        System.out.println("바나나 갯수 : " + bananaCount); // 3

        // 3. contains(key) : 키의 존재유무를 Boolean 값으로 조회
        Boolean isApple = fruitMap.containsKey("Apple");
        Boolean isMango = fruitMap.containsKey("Mango");

        System.out.println("Apple 있는지: " + isApple); // 있으니 true
        System.out.println("Mango 있는지: " + isMango); // 없으니 false

        // 4. remove(key) : 키를 맵에서 삭제
        fruitMap.remove("Apple");
        System.out.println("fruitMap : " + fruitMap); // {Kiwi=20, Orange=5, Banana=3}

        // 5. size() : 맵에 저장된 키-값 쌍의 개수를 반환
        System.out.println("fruitMap 사이즈 : " + fruitMap.size()); // 3

        // 6. keySet() : 맵에 있는 키값만 반환 -> 리스트값으로 반환함 []
        System.out.println(fruitMap.keySet()); // [Kiwi, Orange, Banana]
    }
}
