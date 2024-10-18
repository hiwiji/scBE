package exercise.chapter_31;

public class FishChild extends Fish {

    // 새로운 필드 추가
    private boolean eatable;  //식용가능여부


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
        System.out.printf (myInfo() + "는 %s를 아주 열심히 먹고 있습니다.", food);

    };



}
