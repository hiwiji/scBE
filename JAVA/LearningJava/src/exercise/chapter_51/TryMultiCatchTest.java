package exercise.chapter_51;

import exercise.chapter_20.ArrayIndex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryMultiCatchTest {

    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("src/exercise/chapter_51/test.txt");

            int i = 10;
            int data = 100/ i;

            String str = "abc";
            System.out.println(str.toUpperCase());

            int index = 10;
            int[] intArr = new int[10];
            System.out.println(intArr[index]);



        } catch (FileNotFoundException e) {
            System.out.println("File을 찾을 수가 없습니다.");
            e.printStackTrace();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Arthimetic Exception 또는 NullPoint Exception이 발생했습니다.");
            e.printStackTrace();
        } catch (Exception e) {
            //Exception의 최상위 객체?
            System.out.println("최종 Exception 필터에 걸렸습니다.");
            e.printStackTrace();

        }

        System.out.println("메인메소드가 종료됩니다.");

    }
}
