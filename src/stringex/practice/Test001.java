package stringex.practice;

import java.util.Scanner;

import javax.print.Doc;

class 개인정보 {
    private String name; // 이름
    private String tel; // 전화번호
    private char gender; // 성별
    private int age; // 나이

    public 개인정보(String name, String tel, char gender, int age) {
        this.name = name;
        this.tel = tel;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Test001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String data = sc.nextLine();

        String[] tokens = data.split("-|:");

        if (tokens[0].equals("A01")) {
            for (int i = 1; i < tokens.length; i++) {
            }
        } else {
            System.out.println("프로그램 종료");
        }

        String name = tokens[2];
        String tel = tokens[4];
        char gender = tokens[6].charAt(0);
        int age = Integer.parseInt(tokens[8].trim());

        개인정보 doc1 = new 개인정보(name, tel, gender, age);

        System.out.println("이름은 " + doc1.getName() + " 입니다");
        System.out.println("전화번호는 " + doc1.getTel() + " 입니다");
        System.out.println("성별은 " + doc1.getGender() + " 입니다");
        System.out.println("나이는 " + doc1.getAge() + " 입니다");
    }
}