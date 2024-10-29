package exercise.chapter_40;

public class Staff {
    // 속성

    // 매상
    private int salesAmount;

    // 행위

    // 1. 손님 결제 돕는다? - 일반손님
    public int helpPayment(Customer customer, int price) {
       return customer.calculatePrice(price);
    }
    
//    // 1. 손님 결제 돕는다 - vip손님
//    public int helpPayment(VIPCustomer customer, int price) {
//        return customer.calculatePrice(price);
//    }

    //2. 매상에 돈을 더한다.
    public void addSalesAmount (int cash) {
        salesAmount += cash;
    }

    //3. 최종 매상 출력
    public void printMySalesAmount() {
        System.out.println("오늘의 최종 매상은 " + this.salesAmount + "원 입니다." );
    }


    // setter
    public void setSalesAmount(int salesAmount) {
        this.salesAmount = salesAmount;
    }
}
