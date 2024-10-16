package exercise.chapter_24;

public class MethodExamples {

    // 일반적인 입력값, 출력값도 있는 경우
    // 둘 다 하나인 경우

    static int toUnicode(char ch) {
        return (int) ch;
    }

    // 파라미터가 여러개인 경우
    static int sumAndMultiplyFour(int a, int b) {
        return (a + b) * 4;
    }

    // 메인메소드 : 결과값 출력하는 곳
    public static void main(String[] args) {
        char ch = 'A';
        int decode = toUnicode(ch);
        System.out.println(decode); //65

        int myInt1 = 10;
        int myInt2 = 5;
        int result = sumAndMultiplyFour(myInt1, myInt2);
        System.out.println(result); // 60


        // 결과값 : 인자값 x 출력값 o
        String res = sayHello();
        System.out.println(res); // 리턴값 hello


        // 결과값 : 인자값 ㅇ, 출력값 x
        printHello("printHello"); // printf값 출력

        // 결과값 : 인자값 x 출력값 x
        printHi(); // print값 출력
    }

    // 인자값이 없을 수 있다, 출력값은 있음
    static String sayHello() {
        return "Hello";
    }

    // 인자값이 있지만, 출력값은 없음
    static void printHello(String str) {
        System.out.printf("함수 안에서 실행합니다. %s\n", str);
    }

    // 인자값도 없고, 출력값도 없는거
    static void printHi(){
            System.out.println("Hi");
    }
}

