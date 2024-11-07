package exercise.chapter_57;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable {

    private final long serialVersionUID = 1L;

    // 속성
    // 고객ID, 고객이름, 고객 등급, 보너스포인트, 포인트 적립 비율
    static int serialNums = 1; // 클래스변수
    String hello1 = "Hello";
    String hello2 = "Hello2";


    public String customerID; // 고객id
    public String name; // 고객이름
    protected String customerGrade; // 고객등급

    protected int bonusPoint; // 보너스포인트
    protected double bonusPointRatio; // 포인트 적립비율

    // 행위
    // 1. 돈을 지불한다.
    public int calculatePrice (int price) {
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }

   Customer(){}

    public Customer(String customerID, String name) {
        this(name);
        this.customerID = customerID;
    }

    // 생성자
    public Customer(String name) {
        this.customerID = "Customer" + serialNums++;
        // 고객Id는 Customer(숫자)로 순차생성된다.
        this.name = name;
        this.customerGrade = "SILVER"; // 생성시 실버 등급으로 시작한다.
        this.bonusPointRatio = 0.01; // 생성시 포인트 비율은 0.01 포인트이다
        this.bonusPoint = 0;
    }

    public void printMyInfo() {
        System.out.printf("Customer(customerID=%s, name=%s, customerGrade=%s, bonusPoint=%d)\n",
                        this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }

    @Override
    public String toString() {
        return String.format("Customer(customerID=%s, name=%s, customerGrade=%s, bonusPoint=%d)\n",
        this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) { // object null 유무 확인
            return false;
        }
        if (obj instanceof Customer) { // null이 아닐 경우 다운캐스팅 해야함
                                        // 왜? Object보다 낮은 Customer와 타입 맞춰주기 위해서

            Customer customer = (Customer) obj;  //  obj 다운캐스팅 ==> Customer가 됨

            return customer.customerID == this.customerID;
            // 상대방 customerID가 나의 customerID 와 같은지
            }

            return false; // 그렇지 않으면 false 반환
        }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.customerID);
    }


    }

