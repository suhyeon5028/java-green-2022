package ex11;

// 오버라이드 = 무효화시키다(부모의 메서드를 무효화시키다)
// 오버라이드를 통해서 변수에 접근해야함
class 애완동물 {
    void sound() {
    }

    // 무효화됨
    void printName() {
        System.out.println("애완동물 printName");
    }

    void changeName() {
    }
}

class 강아지 extends 애완동물 {

    String name = "강아지";

    void printName() {
        System.out.println(name);
    }

    void changeName() {
        name = "변경된 강아지";
    }

    void sound() {
        System.out.println("멍멍");
    }
}

class 고양이 extends 애완동물 {

    String name = "고양이";

    void printName() {
        System.out.println(name);
    }

    void changeName() {
        name = "변경된 고양이";
    }

    void sound() {
        System.out.println("야옹");
    }
}

public class ExtendsEx03 {

    static void start(애완동물 u1) {
        u1.sound();
        // System.out.println(u1.name);
        u1.printName();
        u1.changeName();
        u1.printName();
        System.out.println("=============");
    }

    public static void main(String[] args) {
        애완동물 cat = new 고양이(); // 고양이(printName), 애완동물(printName)
        start(cat);

        애완동물 dog = new 강아지(); // 강아지(printName), 애완동물(printName)
        start(dog);
    }
}