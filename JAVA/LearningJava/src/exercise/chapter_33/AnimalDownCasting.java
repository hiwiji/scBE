package exercise.chapter_33;

public class AnimalDownCasting {

    public static void main(String[] args) {
        // 다운 캐스팅 확인여부

        // 버드로 만들었는데 버드로 다시 바꿈
        Animal animal = new Bird();
        //Bird bird = (Bird) animal;
        checkBirdAndFly(animal);

        // 애니멀로 만들었는데 버드로 다시 바꿈 (오류뜸)
        Animal animal2 = new Animal();
        //Bird bird2 = (Bird) animal2;
        checkBirdAndFly(animal2);

        // 펄슨로 만들었는데 버드로 바꿈 (오류뜸)
        Animal animal3 = new Person();
        //Bird bird3 = (Bird) animal3;
        checkBirdAndFly(animal3);
    }

    static void checkBirdAndFly(Animal animal) {
        if(animal instanceof Bird) { // 너 새니?
           Bird bird = (Bird) animal; // 다운캐스팅
            bird.fly();
        }
        else {
            System.out.println("너는 새가 아니야");
        }

    }
}
