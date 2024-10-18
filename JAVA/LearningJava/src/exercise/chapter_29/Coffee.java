package exercise.chapter_29;

// 시나리오 참고
// - '아메리카노 커피' 는 물 500ml와 원두 30g으로 만들어진다
// - '아메리카노 커피' 는 '테이크 아웃'으로 포장된다

public class Coffee {
    // 속성
    private String coffeeName; // 커피이름
    private long waterQuantity; // 물의 양 (ml 기준)
    private long coffeeBeanQuantity; // 원두의 양 (g 기준)
    private boolean isWrappedUp; // 포장됨 여부


    // 행위 (메소드로 정의)
    void beWrappedUp() {
        this.isWrappedUp = true; // 이 함수가 실행되면 포장되어있다.
    }

    // 생성자 (
    Coffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity) {
        this.coffeeName = coffeeName;
        this.waterQuantity = waterQuantity;
        this.coffeeBeanQuantity = coffeeBeanQuantity;
        isWrappedUp = false; // 기본값 설정(포장안됨)
    }

    // getter
    public String getCoffeeName() {
        return coffeeName;
    }

    // getter
    public boolean isWrappedUp() {
        return isWrappedUp;
    }
}
