package datatest01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import datatest01.WeatherDto.Response.Body.Items.Item;

public class WeatherDownload {
    public static Map<String, String> getWheatherList(
            String baseDate,
            String baseTime) {
        Map<String, String> weatherMap = new HashMap<>();
        try {
            URL url = new URL(
                    "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=13cWFmj3zbZtaZpsP%2FhywuguJIxK1B0g5KLnbx6WFb0tNP8KkeG5%2B7kuj8MQ8hZAc%2Fc1MJoLdoQJuHXPDUALSA%3D%3D&pageNo=1&numOfRows=1000&dataType=JSON&base_date="
                            + baseDate + "&base_time=" + baseTime + "&nx=96&ny=75&type=json");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            WeatherDto dto = gson.fromJson(responseJson, WeatherDto.class);
            List<Item> result = dto.getResponse().getBody().getItems().getItem();

            for (int i = 0; i < result.size(); i++) {
                weatherMap.put(result.get(i).getCategory(), result.get(i).getObsrValue());
            }
            return weatherMap;
        } catch (Exception e) {
            System.out.println("최근 1일 간의 자료만 제공합니다.");
        }
        return null;
    }
}
