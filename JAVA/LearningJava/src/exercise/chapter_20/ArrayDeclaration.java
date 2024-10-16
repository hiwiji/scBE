package exercise.chapter_20;

import java.util.Arrays;

public class ArrayDeclaration {

    public static void main(String[] args) {
        // int []

        int[] intArr = new int [10]; // int의 기본값만
        int[] intArr2 = new int []{1,2,3,4,5};
        int[] intArr3 = {1,2,3,4,5}; // 2-3 요새 많이 씀, 같은거임

//        System.out.println(Arrays.toString(intArr));
//        System.out.println(Arrays.toString(intArr2));
        System.out.println(Arrays.toString(intArr3));
        System.out.println(intArr3);

        // float[]
        float[] floatArr = new float[10];
        float[] floatArr2 = {1.5f, 2.5f, 3.5f};   // float는 f써주기

//        System.out.println(Arrays.toString(floatArr));
//        System.out.println(Arrays.toString(floatArr2));;

        // boolean
        boolean[] booleans = new boolean[5]; // boolean = 0 = false = 기본값
        boolean[] booleans1 = {true, false, true};

//        System.out.println(Arrays.toString(booleans));
//        System.out.println(Arrays.toString(booleans1));

        // char String
        char[] charArr = new char[10];
        char[] charArr2 = {'A', 'B', 'C'};
        String[] stringArr = new String[10]; // String은 기본값 null
        String[] stringArr2 = {"ABC", "Hello", "World"};

//        System.out.println(Arrays.toString(charArr));
//        System.out.println(Arrays.toString(charArr2));
//        System.out.println(Arrays.toString(stringArr));
//        System.out.println(Arrays.toString(stringArr2));

    }
}
