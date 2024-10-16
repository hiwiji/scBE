package exercise.chapter_20;

import java.util.Arrays;

public class ArrayIndex {

    public static void main(String[] args) {
        // index get
        // {90,87,88,75,99,65}

        int[] studentScores = { 90, 87, 88, 75, 99, 65};
        int score1 = studentScores[0];
        System.out.println(score1); // 90


        // 배열값 변경
        studentScores[2] = 93;
        System.out.println(Arrays.toString(studentScores));
        // 88 -> 93으로 변경


        //Error
        int score6 = studentScores[5]; // 길이보다 작거나 크면 오류발생
                                        // 0~5까지만 가능
        System.out.println(score6);
    }
}
