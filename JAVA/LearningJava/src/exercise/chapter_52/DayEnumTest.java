package exercise.chapter_52;

import java.util.Arrays;

public class DayEnumTest {

    public static void main(String[] args) {

        //각각 Enum 값 정의
        // Ordinal, compareTo, values

        //1. Ordinal : 열거타입을 정의할 때 주어진 순번을 리턴
        Day monday = Day.MONDAY;
        Day sunday = Day.SUNDAY;
        Day thursday = Day.THURSDAY;

        System.out.println("ordinal 값 : " + monday.ordinal()); // 1
        System.out.println("ordinal 값 : " + sunday.ordinal()); // 0
        System.out.println("ordinal 값 : " + thursday.ordinal()); // 4

        // 2. compareTo : 열거 객체를 비교 순번 차이를 리턴 (왼쪽기준)
        System.out.println("CompareTo : " +  monday.compareTo(sunday)); // 1-0 = 1
        System.out.println("CompareTo : " +  monday.compareTo(thursday));  // 1-4= -3

        // 3. values : 열거타입의 모든 열거 객체들을 배열로 만들어 리턴
        Day[] days = Day.values();
        System.out.println("Days : " + Arrays.toString(days));
        // Days : [SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY]

    }
}
