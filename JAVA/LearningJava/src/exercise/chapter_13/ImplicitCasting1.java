package exercise.chapter_13;

public class ImplicitCasting1 {

    public static void main(String[] args) {
        // 덜 정밀한 자료형 -> 더 정밀한 자료형
//        float myFloat = 5.0f;
//        int myInt = myFloat;
//
//        System.out.println(myFloat);

        // 사이즈가 작은 타입 -> 사이즈가 큰 타입
        long myLong = 10L;
        long myInt = myLong;

        System.out.println(myLong);

    }
}

