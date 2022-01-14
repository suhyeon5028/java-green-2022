package ex07;

// 1. 자바는 모든 코드가 class 내부에 있어야 한다.
// 2. 자바는 즉 class만 1급
// 3. class = 설계도
// 4. class는 상태(변수)와 행위(메서드)를 가진다.
// 5. static은 찾을 때 class명.변수명
// 6. static이 아닌 애들을 메모리에 띄우는 법 new class명() => heap에 뜬다.(동적 메모리 공간, 용도가 고정되어 있지 않을 때)

class Dog {
    int 배고픔 = 100; // 0~100

    void 밥먹기() { // 메서드 = 행위
        배고픔 = 0;
    }
}

public class OOPEx04 {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.배고픔);
        d.밥먹기(); // 행위
        System.out.println(d.배고픔);
    }
}
