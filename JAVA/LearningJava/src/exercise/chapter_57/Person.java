package exercise.chapter_57;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    // 이걸 써야 직렬화 할 때 오류가 없다(?)

    private transient String name;
    private String gender;
    private transient int age; // 직렬화(transient)
    private String country;
    private String occupation;

    public void showMyself() {
        System.out.printf("Person 인스턴스: name %s, gender: %s, age: %d\n", this.name, this.gender, this.age);
    }


    public Person(String name) {
        this(name, "unknown");
        // 다음 생성자를 호출하기 위한 this.
    }

    // 초기값 설정
    public Person(String name, String gender) {
        this(name, gender, -1, "Korea", null);
    }

    // 생성자
    public Person(String name, String gender, int age, String country, String occupation) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.country = country;
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    public Person returnMySelf() {
        return this; // 나 자신의 인스턴스를 보내?
    }
}
