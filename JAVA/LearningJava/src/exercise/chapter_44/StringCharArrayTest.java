package exercise.chapter_44;

public class StringCharArrayTest {

    public static void main(String[] args) {
        //CharArray -> String 으로 바꿀 수 있음
        char[] chars = { 'a', 'b', 'c'};

        // String으로 바꾸기
        String str1 = new String(chars); // new 객체로 chars 정의
        String str2 = String.valueOf(chars); // String.valueOf 메서드 이용

        System.out.println(str1); // abc
        System.out.println(str2); // abc

        // Str -> Char array
        char[] chars2 = str1.toCharArray();

        for (char ch : chars2) {
            System.out.println(ch); // a   b  c
        }

        System.out.println(str1.charAt(0)); // 0번째 배열 a 출력
        System.out.println(str1.charAt(1)); // 1번째 배열 b 출력
        System.out.println(str1.charAt(2)); // 2번째 배열 c 출력
        //System.out.println(str1.charAt(3)); // 배열값 없어서 오류
    }
}
