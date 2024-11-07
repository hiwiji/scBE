package exercise.chapter_53;

import static exercise.chapter_53.StringUtils.CharChecker.countChar;

public class StringUtils {

    // 1. 문자열이 비어 있는지 확인
    public static boolean isEmpty(String str) {
        if ( str == null || str.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    // 2. 문자열을 반대로 뒤집기
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();

        for(int i=str.length() -1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }


    public static class CharChecker {
        // 3. 주어진 문자열에서 특정 문자의 개수 세기
        public static int countChar(String str, char targetChar) {
            int count = 0;
            for(int i=0; i<str.length(); i++ ) {
                if(str.charAt(i) == targetChar) {
                    count++;
                }
            }
            return count;
        }

        // 4. 주어진 문자열에 특정 문자가 있는지 확인
        public static boolean containsChar(String str, char targetChar) {
            return countChar(str, targetChar) >= 1;
        }


    }






}
