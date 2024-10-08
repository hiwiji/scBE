package mission;

public class ChuncheonTicket3 {

    /**
     * 시립 박물관 티켓값 반값할인 진행예정
     * 나이가 65세 이상이고, 국적이 한국이면 반값으로 줄 예정
     * 서로 다른 3명의 손님이 옴 반값할인 적용대상인가 아닌가?
     * Alice (나이 70, 나라 미국)
     * Kim (나이 65, 나라 한국)
     * Yoo (나이 42, 나라 한국)
     */
    public static void main(String[] args) {
        final int SENIOR_AGE_STANDARD = 65;

        int aliceAge = 70;
        String aliceCountry = "USA";

        int kimAge = 65;
        String KimCountry = "KOREA";

        int yooAge = 42;
        String yooCountry = "KOREA";


        boolean aliceDiscount = (aliceAge >= SENIOR_AGE_STANDARD) && (aliceCountry == "KOREA");
        boolean kimDiscount = (kimAge >= SENIOR_AGE_STANDARD) && (KimCountry == "KOREA" );
        boolean yooDiscount = (yooAge >= SENIOR_AGE_STANDARD) && (yooCountry == "KOREA");

        System.out.println("Alice : " + aliceDiscount);
        System.out.println("kim : " + kimDiscount);
        System.out.println("yoo : " + yooDiscount);

    }
}
