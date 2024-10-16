package exercise.chapter_24;

public class Scores {

    public static void main(String[] args) {
        // A class 학생들 점수
        int studentAClass1 = 50;
        int studentAClass2 = 30;
        int studentAClass3 = 45;

        // B class 학생 점수
        int studentBClass1 = 60;
        int studentBClass2 = 65;
        int studentBClass3 = 66;

        // Average A class
//        int sumAClass = studentAClass1 + studentAClass2 + studentAClass3;
//        double averageAClass = sumAClass / (double) 3; // 명시적 변환을 해줘야함

        double averageAClass = calculateAverage(studentAClass1, studentAClass2, studentAClass3);

        // B class
        //int sumBClass = studentBClass1 + studentBClass2 + studentBClass3;
        //double averageBClass = sumBClass / (double) 3;

        double averageBClass = calculateAverage(studentBClass1, studentBClass2, studentBClass3);

        System.out.printf("A학급의 평균 점수는 %.2f, B학급의 평균 점수는 %.2f\n", averageAClass, averageBClass);

    }

        static double calculateAverage(int studentScore1, int studentScore2, int studentScore3) {
            int sumBClass = studentScore1 + studentScore2 + studentScore3;

            return sumBClass / (double) 3;
        }

}

