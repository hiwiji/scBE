package exercise.chapter_45;

public class Point <T extends Number, V extends Number>{
// extends를 이용하면 최소 Number 하위의 타입이므로 따로 증명안해줘도됨

    private T x;
    private V y;


    // Contructor
    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    // getter
    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }

    public Double calculateDistance() {
        // (X**2 + y**2) ^ 1/2
//        if (! (this.x instanceof Number) ) {
//            return null;
//        }
//        if (! (this.y instanceof Number) ) {
//            return null;
//        }

        Double num1 = this.x.doubleValue();
        Double num2 = this.y.doubleValue();

        return Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2) );
        // Math.pow: 제곱근
    }
}
