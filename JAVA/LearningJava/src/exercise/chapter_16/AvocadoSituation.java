package exercise.chapter_16;

public class AvocadoSituation {

    public static void main(String[] args) {
        // 장보기 전
        int milks = 0; // 우유 0개
        int avocados = 0; // 아보카도 0개
        boolean existedAvocade = true; // 아보카도 있는가 true

        // 장보기 (아내가 이해한거) == if문
//        milks = 1;
//        if(existedAvocade) {
//            avocados = avocados + 6;
//        }

        // 장보기 (남편이 이해한거) ==
//        if(existedAvocade) {
//            milks  = 6;
//        }
//        else {
//            milks = 1;
//        }

        //남편이 이해한거 삼항연산자로 변경
        milks = (existedAvocade) ? 6: 0;

        // 집으로 돌아오기
        String comment = String.format("장보고 돌아왔어 %d개 아보카도, %d개 우유 사왔어", avocados, milks);
        System.out.println(comment);
    }
}
