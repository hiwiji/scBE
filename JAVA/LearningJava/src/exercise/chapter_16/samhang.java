package exercise.chapter_16;

public class samhang {

    public static void main(String[] args) {
        int age = 0;

        if (age >= 19) {
            System.out.println("청소년 관람불가");
        }
        else if ( age >= 15 && age < 19 ) {
            System.out.println("15세 이상 관람가");
        }
        else if ( age >= 12 && age < 15 ) {
            System.out.println("12세 이상 관람가");
        }
        else if ( age >= 0 && age < 12 ) {
            System.out.println("전체 관람가");
        }
        else if ( age < 0 ) {
            System.out.println("유아 관람 불가");
        }

    }
}
