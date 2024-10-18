package exercise.chapter_32.fish;

public class Fish {
    // 속성
    private String sex; // "Male","Female"
    protected boolean havingPoison; // true 독있음, false 독없음
    private String StartSpawningDate; // 산란기간 시작
    private String endSpawningDate; // 산란기간 종료
    protected String leavingSea; // 사는 속성


    // 행위
    // 먹는다
    void eat(String food) {
        System.out.printf (myInfo() + "는 %s를 먹고 있습니다.\n", food);
    }
    // 헤엄친다
    void swim(int meter) {
        System.out.println("나는 헤엄칩니다 미터: " + meter);
    }
    // 무리짓는다
    void makeCrowd(Fish otherfish) {
        System.out.println("나는 다른 물고기와 무리 짓습니다.");
    }
    //잔다
    void sleep(){};

    String myInfo() {
        return String.format("물고기(sex=%s, havingPoison=%b, leavingSea=%s)",
                            this.sex, this.havingPoison, this.leavingSea);
    }

    void printfMyInfo() {
        System.out.println(myInfo());
    }


    // setter 등록
    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHavingPoison(boolean havingPoison) {
        this.havingPoison = havingPoison;
    }

    public void setStartSpawningDate(String startSpawningDate) {
        StartSpawningDate = startSpawningDate;
    }

    public void setEndSpawningDate(String endSpawningDate) {
        this.endSpawningDate = endSpawningDate;
    }

    public void setLeavingSea(String leavingSea) {
        this.leavingSea = leavingSea;
    }
    
    // getter 등록
    public boolean isHavingPoison() {
        return havingPoison;
    }

//    Fish(){
//        System.out.println("부모 물고기가 생성되고 있습니다.");
//    }

    Fish(){}

    public Fish(String sex, boolean havingPoison, String startSpawningDate, String endSpawningDate, String leavingSea) {
        this.sex = sex;
        this.havingPoison = havingPoison;
        StartSpawningDate = startSpawningDate;
        this.endSpawningDate = endSpawningDate;
        this.leavingSea = leavingSea;
    }
}
