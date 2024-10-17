package exercise.chapter_27.pacakgeTwo;

import exercise.chapter_27.pacakgeOne.ClassA;

public class ClassB {

    void testPublic(ClassA classA) {
        String str = classA.publicStr;
        classA.methodPublic();
    }

    void testPrivate(ClassA classA) {
//        String str = classA.privateStr;
//        classA.methodPrivate();
    }

    public void testDefault(ClassA classA) {
//        String str = classA.defaultStr;
//        classA.methodDefault();
    }
}
