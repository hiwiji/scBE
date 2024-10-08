package exercise.chapter_15;

public class Literal {
    public static void main(String[] args) {
        int num = 0b1010; // 2진법
        System.out.println(num); // 10

        int num2 = 0xAC0; // 16진법  12*16 + 10*16^2
        System.out.println(num2); // 2752

        double myDouble = 5.22E5;
        System.out.println(myDouble);

        double myDouble2 = 2.55E-3;
        System.out.println(myDouble2);

        //null : 아무것도 없다
        String str = null;
        System.out.println(str);
    }
}
