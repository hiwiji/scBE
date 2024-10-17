package exercise.chapter_27.pacakgeOne;

public class ClassA {
    // public
    public String publicStr;

    public void methodPublic() {};

    // private
    private String privateStr;

    private void methodPrivate() {};

    void testPrivate() {
        String str = privateStr;
        methodPrivate();
    }

    // default
    String defaultStr;

    void methodDefault(){};



}
