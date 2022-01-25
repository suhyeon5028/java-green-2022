package ex11;

class 동물1 {
    String name;
    int hp;
    int attack;

    String name() {
        return name;
    }

    int hp() {
        return hp;
    }

    int attack() {
        return attack;
    }

    // 값을 변경할땐 return을 쓸 필요없고 void 쓰면됨
    void changeHp(int a) {

    }

}

class 사자1 extends 동물1 {

    String name = "사자";
    int hp = 100;
    int attack = 10;

    String name() {
        return name;
    }

    int hp() {
        return hp;
    }

    int attack() {
        return attack;
    }

    void changeHp(int a) {
        hp = a;
    }

}

class 호랑이1 extends 동물1 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;

    String name() {
        return name;
    }

    int hp() {
        return hp;
    }

    int attack() {
        return attack;
    }

    void changeHp(int a) {
        hp = a;
    }
}

class 곰1 extends 동물1 {
    String name = "곰";
    int hp = 100;
    int attack = 50;

    String name() {
        return name;
    }

    int hp() {
        return hp;
    }

    int attack() {
        return attack;
    }

    void changeHp(int a) {
        hp = a;
    }

}

public class Test {
    // 오버라이딩 = 무효화하다 -> 아래로 타고 내려가는 기법
    // 사자 -> 호랑이 공격

    static void attack(동물1 u1, 동물1 u2) {

        int hp;
        System.out.println(u2.name() + "가 공격당하고 있습니다.");
        hp = u2.hp() - u1.attack();
        u2.changeHp(hp);
        System.out.println(u2.name() + "의 hp : " + u2.hp());
    }

    public static void main(String[] args) {
        동물1 사자 = new 사자1();
        동물1 호랑이 = new 호랑이1();
        동물1 곰 = new 곰1();

        attack(사자, 호랑이);
        attack(사자, 호랑이);

    }

}