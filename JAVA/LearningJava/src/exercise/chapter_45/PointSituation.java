package exercise.chapter_45;

public class PointSituation {

    public static void main(String[] args) {
        Point<Integer, Integer> point1 = new Point(1,5);
        Point<Integer, Double> point2 = new Point(5,4.55);
        Point<Double, Double> point3 = new Point(1.5,5.5);


        System.out.println(point1.calculateDistance()); // 5.0990195135927845
        System.out.println(point2.calculateDistance()); // 6.760362416320593
        System.out.println(point3.calculateDistance()); // 5.70087712549569

        Point<Float, Integer> point4 = new Point(0.5f, 5);

        System.out.println(point4.calculateDistance());
        // null . 왜? x가 숫자가 아니여서 null처리

    }
}
