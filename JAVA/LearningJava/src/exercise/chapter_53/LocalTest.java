package exercise.chapter_53;

public class LocalTest {

    public static void main(String[] args) {
        // 내부 로컬 클래스 (메소드 안에서만 움직임?)
        class LocalWalk implements Walkable {

            @Override
            public void walk() {
                System.out.println("LocalWalk: Walking");
            }
        }

        LocalWalk localWalk = new LocalWalk();
        localWalk.walk();

        int i = 100;


        // 익명 클래스
        Walkable anonymousWalk = new Walkable() {

            @Override
            public void walk() {
                // i = 200;
                System.out.println("i: " + i);
                // i=100 외부 접근으로 읽는건 가능, 수정은 불가
                System.out.println("AnonymousWalk: Walking");
            }
        }; // 세미콜론 붙이기

        anonymousWalk.walk();
    }
}
