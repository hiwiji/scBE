package exercise.chapter_13;

public class ImplicitCasting2 {
    public static void main(String[] args) {

        // + * 사칙연산 Casting
        int myInt = 10;
        double myDouble = 55.1;

        double result1 = myInt + myDouble;
        // 더 큰타입으로 더해야함 (int보다 double이 크니까 double로)
        System.out.println(result1);


        int myInt2 = 10;
        long myLong = 20L;
        long result2 = myInt2 + myLong;
        System.out.println(result2);


        // "/"
        int number1 = 10;
        float number2 = 3.0f;

        float result3 = number1 / number2;
        // int는 소수점을 버려서 10/3은 3.333이 아닌 3만 나옴
        // 그럴 땐 하나를 float로 바꿈
        System.out.println(result3); // 3.3333으로 나옴

    }
}
