package exercise.chapter_19;

public class Break {

    public static void main(String[] args){
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if(i == 5) {
                // 1 + 2 + 3 + 4 == 10
                // 5가 되는순간 나감
                break;
            }
            sum += i;
        }
        System.out.printf("모든 수를 더한 값은 %d", sum);
    }
}
