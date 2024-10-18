package exercise.chapter_29;


// 시나리오 참고
// 1. '캐셔'는 "아메리카노"가 얼마인지 확인한다.
// 2. '캐셔'는 '아메리카노' 가격을 답변해준다.
// 3. '캐셔'는 '자신의 매상'에 돈을 더한다.
// 4. '캐셔'는 '아메리카노' 주문을 알린다.
// 5. '캐셔'는 '아메리카노 커피'를 포장한다.
// 6. '캐셔'는 '아메리카노 커피' 준비완료를 알린다.

// 가격표
// 아메리카노 : 5천원, 카페라떼 : 6천원, 카페모카 : 6500원, 카푸치노 : 6천원

public class Cashier {

    // 속성
    private long salesAmount; // 매상

    // 행위
    // 커피가격 확인
    public long checkCoffeePrice(String coffeeName){
        long price; // 초기값 0

        switch (coffeeName) {
            case "아메리카노" :
                price = 5000;
                break;
            case "카페라떼" :
                price = 6000;
                break;
            case "카페모카" :
                price = 6500;
                break;
            case "카푸치노" :
                price = 6000;
                break;
            default: // 메뉴판에 없으면 0
                price = 0;
                break;
        }
        return price;

    }

    // 가격 답변
    public void replyCoffeePrice(String coffeeName, long price) {
        if ( price == 0 ) {
            System.out.println("캐셔 : 죄송합니다. 손님 말씀하신 메뉴: " + coffeeName + "는 저희 가게에 없습니다.");
        }
        System.out.println("캐셔 : 말씀하신 커피 " + coffeeName + " 가격은 " + price + "원 입니다.");

    }

    // 기존매상에 돈을 더하기
    public void addAmount(long money) {
        this.salesAmount += money;
    }

    // 주문 알림
    public void sayOrder(String coffeeName) {
        System.out.println("캐셔 : 커피 " + coffeeName + " 주문이 들어왔습니다.");
    }

    // 아메 커피 포장
    public Coffee wrapUpCoffee(Coffee coffee) {
        coffee.beWrappedUp();
        return coffee;
    }

    // 커피 준비 완료 알림
    public void sayCoffeeReady(Coffee coffee) {
        String coffeeName = coffee.getCoffeeName();
        System.out.println("캐셔 : 주문하신 커피 " + coffeeName + "가 준비완료 되었습니다.");
    }

    // setter
    public void setSalesAmount(long salesAmount) {
        this.salesAmount = salesAmount;
    }
}

