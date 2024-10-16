package exercise.chapter_14;

public class Encoding {

    public static void main(String[] args) {
        // 'Z' -> int
        char ch1 = 'Z';
//        System.out.println(ch1); // Z
//        System.out.println( (int) ch1); //90
//
//        // Int -> char
//        // 참고 : 65~90 : A~Z, 96~122 : a~z
//        int num = 66;
//        System.out.println(num);  //66
//        System.out.println( (char) num); // B
//
//        // 대소 비교
//        char smallA = 'a';
//        char largeA = 'A';
//
//        boolean result = smallA > largeA; //true
//        System.out.println(result);

        // 한글
        char hangul = '\uAC00'; // 가
        System.out.println(hangul);

        // 특수 "\t" , "\n", "\'"
        char special1 = '\t';
        System.out.println(special1);

        char special2 = '\n';
        System.out.println(special2);

        char special3 = '\'';
        System.out.println(special3);



    }
}
