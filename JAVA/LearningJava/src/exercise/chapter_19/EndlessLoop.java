package exercise.chapter_19;

public class EndlessLoop {

    public static void main(String[] args) {
        //tip : 분 단위로 계산할거임

        final int WAKE_UP_TIME = 8 * 60; // 8시 기상
        final int END_DAY = 24 * 60; // 24시간 * 60분

        int now = WAKE_UP_TIME;

        System.out.println("아 공부하기 싫다 30분 부터 해야지");
        while (now < END_DAY) {
            now++;
            int hour = now / 60;

            if ( now % 60 == 0 ) {

                System.out.printf("지금 시간은 %d시 정각이네\n", (now / 60));
                System.out.println();
            }

            if( hour == 10) {
                break;
            }

            if ( now % 60 == 34) {
                System.out.println("헐 34분 이잖아?");
                System.out.println("그럼 그냥 정각되면 해야겠다");
            }
            if ( now % 60 == 8) {
                System.out.println("미친 8분이네");
                System.out.println("아 공부하기 싫다 30분부터 해야지");
            }
        }


    }
}
