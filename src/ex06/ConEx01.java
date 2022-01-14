package ex06;

public class ConEx01 {
    public static void main(String[] args) {
        int point = 89; // 변수(성적)

        // 자바에서 괄호(조건문)가 나오고 중괄호가 나오면 행위의 영역
        if (point >= 90) {
            System.out.println("A학점입니다");
        } else { // if에 해당하지 않으면
            System.out.println("A학점이 아닙니다");
        }
    }
}
