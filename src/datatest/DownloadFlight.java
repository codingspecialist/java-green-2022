package datatest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class DownloadFlight {
    // 특정 날짜에 특정 출발지에서 특정 목적지로 도착하는 항공편 정보 가져오는 메서드
    // DownloadFlight.getFlightList("20220126", "제주", "김해");
    public static List<FlightItem> getFlightList(
            String depPlandTime,
            String depAirportNm,
            String arrAirportNm) {

        // 공항목록을 조회하여 Map에 담는다.
        Map<String, String> airportMap = DownloadAirport.getAirportList();
        String depAirportId = airportMap.get(depAirportNm);
        String arrAirportId = airportMap.get(arrAirportNm);

        try {
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&numOfRows=10&pageNo=1&depAirportId="
                            + depAirportId + "&arrAirportId=" + arrAirportId + "&depPlandTime="
                            + depPlandTime + "&_type=json");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();

            System.out.println(responseJson);
            ResponseDto<FlightItem> dto = gson.fromJson(responseJson,
                    TypeToken.getParameterized(ResponseDto.class, FlightItem.class).getType());

            if (dto.getResponse().getBody().getTotalCount() == 0) {
                System.out.println("응답코드 : " + dto.getResponse().getHeader().getResultCode());
                System.out.println("Flight 항공편이 0건입니다.");
            }

            List<FlightItem> result = dto.getResponse().getBody().getItems().getItem();
            return result;
        } catch (Exception e) {
            System.out.println("항공편 조회중 오류가 발생했습니다." + e.getMessage());
        }
        return null;
    }
}
