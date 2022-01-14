package ex06;

public class GugudanEx03 {
    public static void main(String[] args) {

        for (int step = 2; step <= 9; step++) {
            for (int n = 1; n <= 9; n++) {
                // 2~9단
                System.out.println(step + "*" + n + "=" + (step * n));
            }
        }
    }
}
