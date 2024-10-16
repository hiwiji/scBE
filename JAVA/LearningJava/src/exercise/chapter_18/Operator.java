package exercise.chapter_18;

public class Operator {

    public static void main(String[] args) {

        // += *=
        int myInt = 5;
        myInt *= 10;
        //System.out.println(myInt);


        // 단항 연산자 ++
        int myInt2 = 10;
        // --myInt2;

        /*앞에 -- 치면 먼저 빼주기 */
        System.out.println(--myInt2 ); // 10-9 = 9
        System.out.println( myInt2 ); // 9

        /*뒤에 -- 치면 먼저 출력 전에 먼저 보내고 다음에 빼주기 */
        System.out.println(myInt2-- ); // 10
        System.out.println( myInt2 ); // 9
    }
}
