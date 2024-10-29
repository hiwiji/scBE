package exercise.chapter_40;

public class VIPCustomer extends Customer {

    static int serialNums = 1;


    static {
        System.out.println("VIP Customer 클래스가 로딩 됩니다.");
    }
    // 속성
    private String agentID; // vip담당직원ID
    private double discountRatio; // 구매할인율


    //행위
    // 돈 지불하기
    @Override
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }

    // vip 담당직원 부르기
    public void callAgent() {
        System.out.println("담당직원" + this.agentID + "님 문의드릴게 있어요~" );

    }

    // 생성시 vip 등급으로 시작
    public VIPCustomer(String name) {
        super();
        this.customerID = "VIP" + serialNums++;
        this.name = name;
        this.customerGrade = "VIP";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.05;
        this.discountRatio = 0.1;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    @Override
    public void printMyInfo() {
        System.out.print("VIP");
        super.printMyInfo(); // 이렇게 하면 부모클래스에서 VIP만 붙어서 실행됨
    }
}
