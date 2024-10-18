package exercise.chapter_29;

// 시나리오 참고
// 1. '바리스타'는 "아메리카노" 주문 확인을 알린다.
// 2. '바리스타'는 물 500ml와 원두 30g으로 아메리카노 커피를 만든다
// 3. '바리스타'는 '아메리카노 커피' 완성을 알린다
public class Barista {

    // 속성

    // 행위

    //주문확인 알림
    public void noticeOrder(String coffeeName) {
        System.out.println("바리스타 : 커피주문 확인했습니다. 커피 :" + coffeeName);
    }

    // 커피 만들기
    public Coffee makeUpCoffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity) {
         Coffee coffee = new Coffee(coffeeName, waterQuantity, coffeeBeanQuantity);
         return coffee;
    }

    // 커피완성 알림
    public void sayCoffeeReady(Coffee coffee) {
        String coffeeName = coffee.getCoffeeName();
        System.out.println("바리스타 : 커피 제작이 완료되었습니다. 커피 : "  + coffeeName);
    }



}
