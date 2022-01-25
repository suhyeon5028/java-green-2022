package ex05;

public class VarEx01 {
    public static void main(String[] args) {
        byte num; // 변수의 선언 (메모리에 공간 확보)
                  // 그릇만 만들어둔 상태
        num = 1; // 확보하고 데이터 대입
        byte num2 = 100; // 변수의 초기화 (확보 + 대입)
        System.out.println(num);
        System.out.println(num2);
    }
}