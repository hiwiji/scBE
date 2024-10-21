package exercise.chapter_34;

// 백화점 상황
public class DepartmentSituration {

    public static void main(String[] args) {

        // 전제 상황
        int price = 10_000;
        Staff staff = new Staff();  // 직원은 한명
        staff.setSalesAmount(1_000_000); // 매상 100만원

        // 단골손님
        Customer customer = new VIPCustomer("아이유");


        // 손님 줄을 배열로 표현
        Customer[] customerQueue = {
                new Customer("권율"), new Customer("이순신"), new VIPCustomer("광해군"),
                customer, new Customer("김좌진"), customer,
                new Customer("장원영"), customer, new VIPCustomer("유기현"),
                new GolderCustomer("이민혁"),new GolderCustomer("채형원")
        };

        // 시나리오
        for(Customer customerEach : customerQueue) {
            customerEach.printMyInfo();
            int cash = staff.helpPayment(customerEach, price);
            System.out.printf("내가 내는 금액은 : %d\n", cash);
            staff.addSalesAmount(cash);
        }

        staff.printMySalesAmount();

    }

}


