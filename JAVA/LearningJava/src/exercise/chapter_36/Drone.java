package exercise.chapter_36;

// Flyable에 Default 설정 되있어서 빨간오류 안뜸
public class Drone implements Flyable {
    // 속성
    private String droneID; // 드론ID
    private long remainingFuelAmount; // 잔여 연료량
    private long remainingFileStorage; // 사진 파일용량


    // 행위
    // 1. 난다

    // 2. 사진을 찍는다.
    public void takePicture() {
        Flyable.printLanding();
        System.out.println("이 드론은 사진을 찍고 있습니다.");
    }

}
