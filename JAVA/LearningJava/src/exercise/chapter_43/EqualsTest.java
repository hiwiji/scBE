package exercise.chapter_43;

public class EqualsTest {

    public static void main(String[] args) {

        Customer customer1 = new Customer("ID1", "민철");
        Customer customer2 = customer1;

        Customer customer3 = new Customer("ID1", "민철");
        Customer customer4 = new Customer("ID2", "철민");

        System.out.println(customer1);
        System.out.println(customer3);

        System.out.println(customer1.equals(customer2)); // true

        System.out.println(customer1.equals(customer3)); // false 다운캐스팅 후 true
        System.out.println(customer1 == customer3); // false (가리키는 메모리 주소값이 달라서)
        System.out.println(customer1 == customer2); // true (대입된거라 가리키는 메모리 주소값이 같음)
        //System.out.println(customer1.equals(customer4));


    }
}
