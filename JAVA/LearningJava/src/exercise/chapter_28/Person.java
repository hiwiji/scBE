package exercise.chapter_28;

public class Person {

    private String name;
    private String gender;
    private int age;

    public void showMyself() {
        System.out.printf("Person 인스턴스: name %s, gender: %s, age: %d\n", this.name, this.gender, this.age);
    }


    public Person(String name) {
        this(name, "unknown");
        // 다음 생성자를 호출하기 위한 this.
    }

    public Person(String name, String gender) {
        this(name, gender, -1);
    }

    // 생성자
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        // 나 자신의 필드나 메소드를 호출하는 this
    }

    public Person returnMySelf() {
        return this; // 나 자신의 인스턴스를 보내?
    }
}
