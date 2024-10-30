package exercise.chapter_43;

public class GolderCustomer extends Customer {

    // 속성
    private double discountRatio;



    // 행위
    // 1. 돈을 지불한다.
    @Override
    public int calculatePrice (int price) {
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }


    public GolderCustomer(String name){
        super();
        this.customerID = "Customer" + Customer.serialNums++;
        this.name = name;
        this.customerGrade = "GOLD";
        this.bonusPoint = 0;
        this.discountRatio = 0.03;
        this.bonusPointRatio = 0.03;

    }

    @Override
    public String toString() {
        return String.format("GoldCustomer(customerID=%s, name=%s," +
                        "customerGrade=%s, bonusPoint=%d, discountRatio=%f)",
                this.customerID, this.name,
                this.customerGrade, this.bonusPoint, this.discountRatio);
    }


}
