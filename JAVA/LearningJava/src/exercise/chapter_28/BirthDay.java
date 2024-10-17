package exercise.chapter_28;

public class BirthDay {
    // 속성
    private int year;
    private int month;
    private int day;


    // 다른 곳에서 접근할 수 있게 getter/setter 만들기
    public void setYear(int Year) {
        this.year = Year; // 나 자신의 인스턴스. 위에 year를 지칭함
    }

    private void printHi() {
        System.out.println("Hi");
    }

    // 생성자 생성
    BirthDay(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
        this.printHi();

    }
}
