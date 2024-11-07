package exercise.chapter_53;

public class OuterClass {

    private int outerData;

    // 생성자
    public OuterClass(int outerData) {
        this.outerData = outerData;
    }

    public class InnerClass {

        private int innerData;

        // 생성자
        public InnerClass(int innerData) {
            innerData = innerData;
        }

        // 메소드
        void display() {
            System.out.println("OuterData : " + outerData);
            System.out.println("InnerData : " + innerData);
        }
    }
}
