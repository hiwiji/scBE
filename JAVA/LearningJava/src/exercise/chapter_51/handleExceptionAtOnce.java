package exercise.chapter_51;

import java.io.FileInputStream;
import java.io.IOException;

public class handleExceptionAtOnce {

    public static void main(String[] args) {
        try {
            printCsvFile("src/exercise/chapter_51/test.csv");
            printTextFile("src/exercise/chapter_51/test.txt");
        } catch (IOException e) {
            System.out.println("fileName에 의한 IOException이 발생합니다.");
            e.printStackTrace();
        }

    }

    // 텍스트파일을 프린트하는거
    public static void printTextFile(String fileName) throws IOException {

        if (!fileName.contains(".txt")) {
            System.out.println("txt 파일이 아닙니다.");
            return;
        }

        FileInputStream fs = new FileInputStream(fileName);

        int i;
        while ((i = fs.read()) != -1) {
            System.out.write(i);
        }

    }

    public static void printCsvFile(String fileName) throws IOException {

        if (!fileName.contains(".csv")) {
            System.out.println("csv 파일이 아닙니다.");
            return;
        }

        FileInputStream fs = new FileInputStream(fileName);

        int i;
        while ((i = fs.read()) != -1) {
            System.out.write(i);
        }

    }
}
