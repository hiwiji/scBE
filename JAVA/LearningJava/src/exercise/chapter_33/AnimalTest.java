package exercise.chapter_33;

public class AnimalTest {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird animal2 = new Bird();
        Fish animal3 = new Fish();

        feed(animal, "빼빼로");
        feed(animal, "벌레");
        feed(animal, "모이");
    }

    public static void feed(Animal animal, String food) {
        animal.eat(food);
    }
}
