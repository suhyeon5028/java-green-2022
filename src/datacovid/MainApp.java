package datacovid;

import java.util.List;
import java.util.Scanner;

import datacovid.CovidDto.Response.Body.Items.Item;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("코로나 현황 범위를 입력하세요.");
        System.out.println("ex) 20220110 시작일");
        String startCreateDt = sc.nextLine();

        System.out.println("ex) 20220115 종료일");
        String endCreateDt = sc.nextLine();

        List<Item> result = CovidDownload.getCovidList(startCreateDt, endCreateDt);

        for (int i = 0; i < result.size(); i++) {
            System.out.println("=======================================");
            System.out.println("누적 의심신고 검사자 : " + result.get(i).getAccExamCnt());
            System.out.println("등록 일시분초 : " + result.get(i).getCreateDt());
            System.out.println("사망자 수 : " + result.get(i).getDeathCnt());
            System.out.println("확진자 수 : " + result.get(i).getDecideCnt());
            System.out.println("게시글 번호 : " + result.get(i).getSeq());
            System.out.println("기준 일 : " + result.get(i).getStateDt());
            System.out.println("기준 시간 : " + result.get(i).getStateTime());
            System.out.println("수정 일시분초 : " + result.get(i).getUpdateDt());
            System.out.println("=======================================");
        }
    }
}