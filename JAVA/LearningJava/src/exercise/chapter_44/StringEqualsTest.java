package exercise.chapter_44;

public class StringEqualsTest {

    public static void main(String[] args) {
        String str1 = "Cat";
        String str2 = "Cat";

        System.out.println(str1 == str2); // true 상수풀에 저장되서
        System.out.println(str1.equals(str2)); // true 값이 같아서

        String str3 = new String("Cat");
        String str4 = new String("Cat");

        System.out.println(str3.equals(str4)); // true 안에 값 비교
                                               // ? cat끼리 비교해서 같음
        System.out.println(str3 == str4); // false
                                          // ? new로 정의해서 값이 같지만
                                          // 객체가 달라서 false뜸

        // str1, str3 비교
        System.out.println(str3.equals(str1)); // true
        System.out.println(str3 == str1);     // false
   }

}
