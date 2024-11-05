package exercise.chapter_45;

public class WrapperClassTest {

    public static void main(String[] args) {
        // 1. Integer Type
        Integer integer1 = new Integer(20);  // 20이라는 int값을 new Integer라는 객체로 선언(박싱했다)
        Integer integer2 = new Integer(30);

        int int1 = integer1.intValue(); // Unboxing, Integer -> int 바꾼거

//        System.out.println(integer1);
//        System.out.println(int1);
        
        // 오토박싱 Integer
        Integer integer3 = 20; // AutoBoxing, new  Integer(20) 실행
        int int2 = integer3; // AutoUnBoxing

//        System.out.println(integer3);
//        System.out.println(int2);

        // 연산자 (서로 다른타입도 잘 나옴)
//        System.out.println(integer1 + integer2); // 50
//        System.out.println(integer1 + int1); // 40

        // 2. Character Type
        Character character = new Character('X'); 
        // 'X' charType -> Character 박싱, 빨간줄이 떠도 자동으로됨
        char ch1 = character.charValue();

//        System.out.println(character); // X
//        System.out.println(ch1); // X

        // 오토박싱 Character
        Character character1 = 'x';
        char ch2 = character1;

        System.out.println(character);
        System.out.println(ch1);

        Character[] characters = {'a', 'b', 'c'};
        char[] chars = {'a', 'b', 'c'};

        String str = String.valueOf(characters);
        String str2 = String.valueOf(chars);

        System.out.println(str); // [Ljava.lang.Character;@b4c966a
        System.out.println(str2); // abc

        // Boolean Type
        Boolean boolean1 = new Boolean(true); // true boolean -> Boolean
        boolean b1 = boolean1.booleanValue();

        //Boolean AutoBoxing
        Boolean boolean2 =  false;
        boolean b2 = boolean2;

        System.out.println(boolean1 & boolean2); // false
        System.out.println(boolean1 | boolean2); // true

    }
}
