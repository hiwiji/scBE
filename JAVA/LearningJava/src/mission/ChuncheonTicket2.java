package mission;

public class ChuncheonTicket2 {

    /**
     * 시립 박물관 오픈기념으로 시청 근무자들에게 박물관 티켓 625장 무료배포
     * 최대 몇명까지 나눠줄 수 있고, 그 때 몇장의 티켓이 남는가?
     * (아주 인기가 많을 예정)
     * 각각 개인은 3장의 티켓을 가져간다
     */
    public static void main(String[] args) {

        int ticket = 625;
        int per = 3;

        int workerTicket = ticket / per;
        int remainTicket = ticket % per;

        System.out.println("무료배포 명수 : " + workerTicket + "명");
        System.out.println("남는티켓 : " + remainTicket + "장");


    }
}
