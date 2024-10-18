package exercise.chapter_32.fish;

public class FishChild extends Fish {

    // 새로운 필드 추가
    private boolean eatable;  //식용가능여부
    protected String leavingSeaChild;


    // 새로운 메서드
    public void digging() {
        System.out.println(myInfo() +"가 모래를 파고 있습니다.");
    }

    //getter   //  boolean값을 getter 할 땐 is가 붙는다.
    public boolean isEatable() {
        return eatable;
    }

    //setter
    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }


    public void becomeDanger() {
        this.havingPoison = true;
    }

    @Override // 부모클래스에 있는건데 재정의 할꺼야...라는 신호?
    void eat(String food) {
        System.out.printf (myInfo() + "는 %s를 아주 열심히 먹고 있습니다.\n", food);
    };


    void printSea(){
        System.out.println(myInfo() + "는 " + this.leavingSeaChild + "바다 출신이고, " +
                            "부모 물고기는 " + super.leavingSea + "바다 출신이야.");
    }

//    @Override
//    String myInfo() {
//        return super.myInfo() + "는 부모 물고기, "
//                + String.format("자식 물고기(eatable=%b, leavingSea=%s)",
//                this.eatable, this.leavingSeaChild);
//    }

    // setter
    public void setLeavingSeaChild(String leavingSeaChild) {
        this.leavingSeaChild = leavingSeaChild;
    }

    // 생성자
//    FishChild() {
//        super(); // ==> 부모클래스의 부모 물고기가 만들어지고 있습니다.
//        System.out.println("자식 물고기가 생성되고 있습니다.");
//    }

    FishChild() {}


    public FishChild(boolean eatable, String leavingSea) {
        this.eatable = eatable;
        super.leavingSea = leavingSea;
    }



    // 자식클래스 생성할 때 부모를 먼저 부르고
    FishChild(String sex, boolean eatable, String leavingSea) {
        // super(안에 부모클래스의 속성값을 넣는다.)
        super(sex,false, "2022", "2022", leavingSea);
        this.eatable = eatable; // 부모필드에는 없는 것
                                // (자식클래스에서 생성해서 this로 직접 자기자신 호출)



    }

}
