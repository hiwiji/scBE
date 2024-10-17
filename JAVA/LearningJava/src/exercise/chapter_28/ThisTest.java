package exercise.chapter_28;

// 실행메서드 만들기
public class ThisTest {
    public static void main(String[] args) {
        //
        Person person1 = new Person("강철중");
        Person person2 = new Person("이민호", "Male");
        Person person3 = new Person(" 아이유", "Female", 30);


//        person1.showMyself();
//        person2.showMyself();
//        person3.showMyself();


        Person person11 = person1.returnMySelf();
        Person person22 = person2.returnMySelf();

        System.out.println(person11); // exercise.chapter_28.Person@2f4d3709
        System.out.println(person22); // exercise.chapter_28.Person@4e50df2e


    }

}
