package exercise.chapter_29;

// 손님 : 현금 - 5만원
// 매상 : 100만원
public class CoffeeShopSituation {

    public static void main(String[] args) {
        // 인스턴스화 (초기화)
        // 손님
        Customer customer = new Customer();
        customer.setCashAmount(50_000);

        // 매상
        Cashier cashier = new Cashier();
        cashier.setSalesAmount(1_000_000);

        //바리스타
        Barista barista = new Barista();


        // 로직 시작
        String coffeeName = "아메리카노";
        boolean isTakeOut = true;

        // 1. 고객이 커피가격 물어봄
        customer.askCoffee(cashier, coffeeName);

        // 2. 캐셔. 커피가격확인 후, 답변
        long price = cashier.checkCoffeePrice(coffeeName);
        cashier.replyCoffeePrice(coffeeName, price);

        // 3. 손님은 자신의 현금에서 돈을 빼서 커피 주문(테이크아웃)
        long cash = customer.withDrawCash(price);
        customer.orderCoffee(coffeeName, isTakeOut);

        // 4. 캐셔 자신의 매상에 돈 더하고 커피주문 알림
        cashier.addAmount(cash);
        cashier.sayOrder(coffeeName);

        //5. 바리스타 커피 주문확인 알림
        barista.noticeOrder(coffeeName);
        //6. 바리스타 커피 제조 물 500ml . 원두 30g
        Coffee coffee = barista.makeUpCoffee(coffeeName, 500, 30);
        //7. 바리스타 커피 완성 알림
        barista.sayCoffeeReady(coffee);

        // 8. 캐셔는 커피 테이크아웃용으로 포장.  9.커피 준비 완료 알림
        Coffee coffeeCompleted = cashier.wrapUpCoffee(coffee);
        cashier.sayCoffeeReady(coffeeCompleted);

        // 10. 손님은 커피를 마시고 기분이 좋아진다.
        customer.drinkCoffee(coffeeCompleted);
        // 내가 주문한게 맞는지
        if(coffeeCompleted.getCoffeeName() == coffeeName &&
            coffeeCompleted.isWrappedUp() == isTakeOut) {
            customer.upgradeMyFeeling();
        }
        customer.showMyInfo();


    }
}
