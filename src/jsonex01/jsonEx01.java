package jsonex01;

import java.util.Arrays;
import java.util.List;

/* 
{
    "name": "홍길동",
    "age": 25,
    "hobby": ["농구", "도술"],
    "family": {"id": 2, "father": "홍판서", "mother": "춘섬"}
 }
  */

class Family {
    private int id;
    private String father;
    private String mather;

    public Family(int id, String father, String mather) {
        this.id = id;
        this.father = father;
        this.mather = mather;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMather() {
        return mather;
    }

    public void setMather(String mather) {
        this.mather = mather;
    }

    @Override
    public String toString() {
        return "Family [father=" + father + ", id=" + id + ", mather=" + mather + "]";
    }

    public String toJson() {
        return "{\"id\":" + id + ",\"father\":" + father + ",\"mather\":" + mather + "}";
    }

}

class User {
    private String name;
    private int age;
    private List<String> hobby;
    private Family family;

    public User(String name, int age, List<String> hobby, Family family) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "User [age=" + age + ", family=" + family + ", hobby=" + hobby + ", name=" + name + "]";
    }

    public String toJson() {
        return "{\"name\":" + name + ",\"age\":" + age + ",\"hobby\":" + hobby + "\"family\":" + family.toJson() + "}";
    }
}

public class jsonEx01 {
    public static void main(String[] args) {
        List<String> hobby = Arrays.asList("농구", "도술");
        Family family = new Family(2, "홍판서", "춘섬");
        User user = new User("홍길동", 25, hobby, family);
        System.out.println(user.toString());

        // 1. json 변경 (개념 : json은 생긴게 json 처럼 생긴것이지 타입은 문자열이다.)
        System.out.println(family.toJson());
        System.out.println(user.toJson());

        // 2. json 데이터 통신 전송

        // 3. json 데이터 받아서 자바 오브젝트 변경
        String inputData = user.toJson();
    }
}
