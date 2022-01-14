package ex07;

class Person2 {
    String name; // 선언
    int height;
    int weight;

    // 디폴트 생성자 = 객체의 초기화를 위해 필요!!
    // constructor(생성자)
    Person2(String d1, int d2, int d3) {
        name = d1;
        height = d2;
        weight = d3;
    }
}

public class OOPEx08 {
    public static void main(String[] args) {
        Person2 s1 = new Person2("홍길동", 170, 70);
        Person2 s2 = new Person2("임꺽정", 150, 200);
        Person2 s3 = new Person2("장보고", 190, 100);

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
    }
}