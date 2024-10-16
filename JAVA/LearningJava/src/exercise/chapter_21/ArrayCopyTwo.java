package exercise.chapter_21;

import java.util.Arrays;

public class ArrayCopyTwo {


    public static void main(String[] args) {

        // for loop 을 이용한 깊은 복사하기
        int[] arr = {1,2,3,4,5,6,7,8,9,10};  // new는 숨어있음

        int[] arr1 = new int[arr.length];

        for(int i=0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }

        // Array.copyOf 함수를 이용해서 깊은 복사하기
        int[] arr2 = Arrays.copyOf(arr, arr.length);


        // 실무에서 가장 많이 사용 (arr.clone) <- 1d Array만 가능
        int[] arr3 = arr.clone();

        arr[0] = 100;

        System.out.println(Arrays.toString(arr)); // 원본
        System.out.println(Arrays.toString(arr1)); 
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));


    }
}
