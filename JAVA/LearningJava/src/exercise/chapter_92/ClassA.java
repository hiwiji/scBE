package exercise.chapter_92;

public class ClassA {

    private ClassB classB;

    public ClassA(ClassB classB) {
        this.classB = classB;
    }

    public ClassA() {
    }

    public void sayHello() {
        String message = classB.sayHello() + ", 그리고 난 A";
        System.out.println(message);
    }


    public void setClassB(ClassB classB) {
        this.classB = classB;
    }
}
