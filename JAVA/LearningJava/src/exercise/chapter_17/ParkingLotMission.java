package exercise.chapter_17;

public class ParkingLotMission {

    public static void main(String[] args) {

        int useMoney = 150_000;
        int parkingTime = 5;

        if (useMoney >= 200_000) {
            parkingTime = parkingTime - 5;
        }
        else if (useMoney >= 100_000) {
            parkingTime = parkingTime - 4;
        }
        else if (useMoney >= 50_000) {
            parkingTime = parkingTime - 3;
        }
        else if (useMoney >= 30_000) {
            parkingTime = parkingTime - 2;
        }
        else if (useMoney >= 10_000) {
            parkingTime = parkingTime - 1;
        }

        String result = String.format("고객님 %d 를 사용했기 때문에, %d 시간 결제하셔야 됩니다.", useMoney, parkingTime);
        System.out.println(result);
    }
}
