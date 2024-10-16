package exercise.chapter_25;

public class Fish {
    // 속성
    String sex; // "Male","Female"
    boolean havingPoison; // true 독있음, false 독없음
    String StartSpawningDate; // 산란기간 시작
    String endSpawningDate; // 산란기간 종료
    String leavingSea; // 사는 속성


    // 행위
    // 먹는다
    void eat(String food) {
        System.out.printf("나, 물고기는 %s를 먹고 있습니다.\n", food);
    }
    // 헤엄친다
    void swim(int meter) {
        System.out.println("나는 헤엄칩니다 미터: " + meter);
    }
    // 무리짓는다
    void makeCrowd(Fish otherfish) {
        System.out.println("나는 다른 물고기와 무리 짓습니다.");
    }
    //잔다
    void sleep(){};
}
