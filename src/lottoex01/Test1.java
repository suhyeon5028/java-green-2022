package lottoex01;

import java.util.ArrayList;

/* 
* 단위 테스트
* 1. ArrayList에 숫자 6개 담기
* 2. Scanner로 금액 입력받아서 횟수 정하기 ex) 5000 -> 5회
* 3. HashSet으로 랜덤한 로또 번호 6개 받기
* 4. HashSet은 순서를 보장ㅇ하지 않고 데이터를 가지기 때문에 순차 정렬이 필요
* 5. 로또 세트(HashSet) 5개를 ArrayList에 담기
* 6. ArrayList 로또 2개 만들어서 비교해보기
*/

public class Test1 {
    public static void main(String[] args) {
        // 1. ArrayList에 숫자 6개 담기 (Mock)

        ArrayList<Integer> buyLotoo = new ArrayList<>();

        buyLotoo.add(1);
        buyLotoo.add(5);
        buyLotoo.add(10);
        buyLotoo.add(20);
        buyLotoo.add(25);
        buyLotoo.add(35);

        if (buyLotoo.size() == 6) {
            System.out.println("제대로 됬습니다");
        } else {
            System.out.println("다시하십시오");
        }
    }
}