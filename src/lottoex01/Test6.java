package lottoex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        // 6. ArrayList 로또 2개 만들어서 비교해보기
        // Mock
        List<Integer> lotto1 = Arrays.asList(1, 3, 5, 6, 7, 10);
        ArrayList<Integer> lotto2 = new ArrayList<>();
        lotto2.add(1);
        lotto2.add(3);
        lotto2.add(5);
        lotto2.add(6);
        lotto2.add(7);
        lotto2.add(10);

        // 두개 비교하는 코드
        int failCheck = 0;
        final int LOTTOCYCLE = 6; // final이 붙은 변수는 대문자로 정의한다.

        for (int i = 0; i < LOTTOCYCLE; i++) {
            if (lotto1.get(i) == lotto2.get(i)) {
                System.out.println(i + "번지의 값이 일치합니다.");
            } else {
                failCheck++;
            }
        }

        if (failCheck == 0) {
            System.out.println("테스트 성공");
        } else {
            System.out.println("테스트 실패");
        }
        System.out.println("틀린 갯수 : " + failCheck);
    }
}
