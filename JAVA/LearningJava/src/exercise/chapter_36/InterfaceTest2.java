package exercise.chapter_36;

public interface InterfaceTest2 {

    public static void main(String[] args) {

        // Drone
        Flyable drone = new Drone();
        Flyable airplane = new Airplane("KH1122");

        drone.fly();
        airplane.fly();

        if (drone instanceof Drone) {
            Drone drone2 = (Drone) drone;
            drone2.takePicture();
        }
    }
}
