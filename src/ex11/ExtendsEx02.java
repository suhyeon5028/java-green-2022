package ex11;

// 오버라이드를 통해 자식의 변수를 찾아낼 수 있다.
class 동물 {
    String getName() {
        return "";
    }

    void setHp(int hp) {
    }

    int getHp() {
        return 0;
    }

    int getAttack() {
        return 0;
    }
}

class 사자 extends 동물 {
    String name = "사자";
    int hp = 100;
    int attack = 10;

    String getName() {
        return name;
    }

    // heap아니고 stack에 뜨는것
    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }
}

class 호랑이 extends 동물 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;

    String getName() {
        return name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }
}

class 곰 extends 동물 {
    String name = "곰";
    int hp = 100;
    int attack = 50;

    String getName() {
        return name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }
}

class 늑대 extends 동물 {
    String name = "늑대";
    int hp = 100;
    int attack = 5;

    String getName() {
        return name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;
    }
}

public class ExtendsEx02 {

    // 오버라이딩 = 무효화하다 ->아래로 타고 내려가는 기법
    static void attack(동물 unit1, 동물 unit2) {
        // unit1(곰)이 unit2(호랑이)를 공격하고 있습니다.
        // unit1(늑대)가 unit2(사자)를 공격하고 있습니다.
        System.out.println(unit1.getName() + "(이)가" + unit2.getName() + "(을)를공격하고 있습니다.");
        unit2.setHp(unit2.getHp() - unit1.getAttack());
        System.out.println(unit2.getName() + "의 hp : " + unit2.getHp());
    }

    public static void main(String[] args) {
        동물 lion = new 사자();
        동물 tiger = new 호랑이();
        동물 bear = new 곰();
        동물 wolf = new 늑대();

        attack(bear, tiger);
        attack(wolf, lion);
    }
}