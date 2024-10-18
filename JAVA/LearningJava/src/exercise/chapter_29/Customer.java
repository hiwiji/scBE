package exercise.chapter_29;

// 시나리오 참고
// 1. '손님'은 '캐셔'에게 "아메리카노" 가격을 물어본다.
// 2. '손님'은 '자신의 현금'에서 돈을 뺀다.
// 3. '손님'은 "아메리카노"를 "테이크아웃"으로 주문한다.
// 4. '손님'은 "아메리카노 커피"를 마신다.
// 5. '손님'은 자신의 기분이 좋아진다.
public class Customer {
    // 속성
    private long cashAmount; // 손님 현금
    private String myFeeling; // 손님 기분

    // 행위
    // 가격 물어본다.
    public void askCoffee(Cashier cashier, String coffeeName) {
        System.out.println("손님 : 커피 " + coffeeName + "는 얼마인가요?");
    }

    // 자신의 돈을 빼서 반환해야함?
    public long withDrawCash(long amount) {
        this.cashAmount -= amount;
        return amount;
    }

    // 커피 테이크아웃으로 주문하기
    public void orderCoffee(String coffeeName, boolean isWrappedUp) {
        System.out.println("손님 : 커피 " + coffeeName + " 주문할게요." +
                         "단, 포장 여부는 " + isWrappedUp + "으로 부탁드려요.");
    }

    //커피를 마신다.
    public void drinkCoffee(Coffee coffee) {
        String coffeeName = coffee.getCoffeeName();
        System.out.println("손님: 나는 커피 " + coffeeName + "를 마신다.");
    }

    //기분이 좋아진다.
    public void upgradeMyFeeling() {
        this.myFeeling = "기분이 좋아지고";
    }

    // 현재 기준 어때여
    public void showMyInfo() {
        System.out.printf("손님: 지금 나는 %s, 현금은 %d 원 있습니다.",
                            this.myFeeling, this.cashAmount);
    }

    // setter
    public void setCashAmount(long cashAmount) {
        this.cashAmount = cashAmount;
    }
}
