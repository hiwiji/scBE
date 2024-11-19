package exercise.chapter_92;

public class Main {

    public static void main(String[] args) {

        ClassA classA1 = new ClassA();
//        classA.sayHello();

        // 의존성 해결하는 방법
        // 1. 생성자로 넣기
        ClassB classB = new ClassB();
        ClassA classA2 = new ClassA(classB);

        classA2.sayHello();

        // 2. setter 넣는방법
        classA1.setClassB(classB);
        classA1.sayHello();

    }
}
