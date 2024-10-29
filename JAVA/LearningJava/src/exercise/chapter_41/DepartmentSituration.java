package exercise.chapter_41;

// 백화점 상황
public class DepartmentSituration {

    public static void main(String[] args) throws InterruptedException {

        // 전제 상황
        int price = 10_000;
        Staff staff = new Staff();  // 직원은 한명
        staff.setSalesAmount(1_000_000); // 매상 100만원

        String hello = "Hello";
        String hello1 = "Hello";
        String hello2 = "Hello";
        String hello3 = "Hello";

        // 단골손님
        Customer customer1 = new Customer("권율");
        Customer customer2 = new Customer("이순신");

        Customer customer3 = new VIPCustomer("광해군");
        Customer customer4 = new VIPCustomer("아이유");
        Customer customer5 = new VIPCustomer("유기현");
        Customer customer6 = new GolderCustomer("이민혁");
        Customer customer7 = new GolderCustomer("채형원");

        // 손님 줄을 배열로 표현
        Customer[] customerQueue = {
                new Customer("김좌진")
        };

        // 시나리오
        for(Customer customerEach : customerQueue) {
            customerEach.printMyInfo();
            int cash = staff.helpPayment(customerEach, price);
            System.out.printf("내가 내는 금액은 : %d\n", cash);
            staff.addSalesAmount(cash);
        }

        staff.printMySalesAmount();

//        while ( true ) {
//            Thread.sleep(100);
//        }

    }

}


