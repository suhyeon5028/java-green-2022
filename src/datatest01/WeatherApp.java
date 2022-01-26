package datatest01;

import java.util.Map;
import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== 사상구 동네예보 ======");
        System.out.println("===== 날짜를 입력하세요 =====");
        System.out.println("ex) 20220101");

        String baseDate = sc.nextLine();

        System.out.println("===== 시간을 입력하세요 =====");
        System.out.println("ex) 0600 (정시단위)");

        String baseTime = sc.nextLine();

        Map<String, String> weatherMap = WeatherDownload.getWheatherList(baseDate, baseTime);
        System.out.println("사상구의 기온은" + weatherMap.get("T1H") + "도 입니다.");
    }
}
