package exercise.chapter_52;

import java.util.Optional;

public class OptionalDefaultTest {

    public static void main(String[] args) {
        String str = null; // 값이 있으면 abc 출력
                            // 값이 없으면 null호출로 0
        Optional<String> optionalS = Optional.ofNullable(str);
                                        // 람다식
        int length = optionalS.orElseGet( () -> "") // 어떤값을 주던간에 빈값 호출하겠다.
                            .length();

        System.out.println(length);
    }
}
