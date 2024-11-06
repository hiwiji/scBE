package exercise.chapter_50;

public class TryCatchTest1 {

    public static void main(String[] args) {

        System.out.println("메인메소드 실행합니다.");

        // 오류가 일어날거 같은 문에 try 넣기
        try{
            int i = 0;
            int data = 50 / i;
            System.out.println("data: " + data);
        } catch (ArithmeticException e) {
            // 경고문 출력
            System.out.println("0으로는 나눌 수가 없습니다.");
            System.out.println("data: " + 0);
            e.printStackTrace();
        }
        // 중요한 로직
        System.out.println("메인메소드 종료합니다.");
    }
}
