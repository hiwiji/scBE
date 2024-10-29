package exercise.chapter_39;

import exercise.chapter_33.Animal;
import exercise.chapter_33.Bird;
import exercise.chapter_33.Person;

public class AnimalDownCasting {

    public static void main(String[] args) {
        // 다운 캐스팅 확인여부

        // 버드로 만들었는데 버드로 다시 바꿈
        Animal animal = new Bird();


        // 애니멀로 만들었는데 버드로 다시 바꿈 (오류뜸)
        Animal animal2 = new  Animal();
        checkBirdAndFly(animal2);

        // 펄슨로 만들었는데 버드로 바꿈 (오류뜸)
        Animal animal3 = new Person();
        checkBirdAndFly(animal3);
    }

    static void checkBirdAndFly(Animal animal) {
        if(animal instanceof exercise.chapter_33.Bird) { // 너 새니?
           exercise.chapter_33.Bird bird = (Bird) animal; // 다운캐스팅
            bird.fly();
        }
        else {
            System.out.println("너는 새가 아니야");
        }

    }
}
