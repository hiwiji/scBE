package exercise.chapter_30;

public class StaticTest {

    public static void main(String[] args) {

        // 클래스 변수
        int num = Student.getSerialNum(); // 초기값 10
        String city = Student.city;
        // String schoolName = Student.schoolName;
        // schoolName은 클래스 변수가 아니여서 인스턴스화 하고나서 해야됨

        System.out.println(num);
        System.out.println(city);

        Student.setSerialNum(10); // 10으로 변경


        // 4명 만들어보기
        Student student1 = new Student("Alice", "Female");
        Student student2 = new Student("Tom", "Male");
        Student student3 = new Student("Taylor", "Female");
        Student student4 = new Student("Mike", "Male");

        // int  num4 = student4.serialNum;
        // System.out.println(num4); // studentID  : 14


        student1.printMyInfo();  // studentID : 10
        student2.printMyInfo();  // studentID : 11
        student3.printMyInfo();  // studentID : 12
        student4.printMyInfo();  // studentID : 13


    }
}
