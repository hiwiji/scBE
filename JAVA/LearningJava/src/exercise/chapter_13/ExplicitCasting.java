package exercise.chapter_13;

public class ExplicitCasting {

    // 강제 형변환 하기
    public static void main(String[] args) {
        // 더 정밀한 타입 -> 덜 정밀한 타입
        float myFloat = 5.55f;
        int myInt = (int) myFloat;
        System.out.println(myInt);


        // size 큰 -> size 작은
        int myInt2 = 600;
        byte myByte = (byte) myInt2;
        System.out.println(myByte);
        // byte 범위 안에 있는건 손실이 없는데 범위가 넘어가면 숫자가 다름
        // int myInt2 =  100; 으로 넣으면 출력도 100이 됨 (손실이 없어서)


        // 연산 "+"
        double myDouble1 = 5.5;
        double myDouble2 = 3.7;

        int result = (int) myDouble1 + (int) myDouble2;
        int result2 = (int) (myDouble1 + myDouble2);
        System.out.println(result); // int로 강제 형변환 => 8 (소수점 버림)
        System.out.println(result2); // 5.5 + 3.7 = 9.2에서 0.2버려서 9나옴


    }
}
