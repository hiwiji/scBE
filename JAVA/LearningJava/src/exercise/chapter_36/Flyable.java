package exercise.chapter_36;

public interface Flyable {
    // 속성
    long atmosphereLimit = 476; //대기권

    // 행위 (메소드는 무조건 구현해야한다)
    //void fly();

    default void fly() {
        System.out.println("<정보> 현재 이 사물은 날고 있습니다.");
    }

    static void printLanding() {
        System.out.println("<경보> 현재 이 사물은 공중에 있습니다.");
    }
}
