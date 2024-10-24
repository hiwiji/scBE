package exercise.chapter_36;

public class InterfaceTest {

    // 1. 메인메소드 만들기
    public static void main(String[] args) {

        // 속성
        System.out.println(Flyable.atmosphereLimit);
     //   Flyable.atmosphereLimit = 100;

        // Flyable
        Flyable bird = new Bird();
        // Bird bird = new Bird();
        // Animal bird = new Bird();

        Flyable airplane = new Airplane("KH1122");

        bird.fly();
        airplane.fly();

        // Walkable
        Walkable person = new Person();
        Person person2 = new Person();
        person2.setName("아이유");

        Walkable robot = new Robot("MX0514");

        person.walk();
        robot.walk();

        // 다운캐스팅
        if ( robot instanceof Robot) {
            Robot robot2 = (Robot) robot;
            robot2.helpPerson(person2); //
        }



    }
}
