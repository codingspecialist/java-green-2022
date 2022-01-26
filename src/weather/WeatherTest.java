package weather;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class WeatherTest {
    public static void main(String[] args) {
        // 1. 다운로드 테스트
        try {
            URL url = new URL(
                    "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&numOfRows=10&pageNo=1&dataType=JSON&base_date=20220126&base_time=1700&nx=97&ny=75");

            // conn -> Byte Stream 선!!
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // 원래 default 1Byte 한글을 읽었기 때문에 한글이 깨졌다.
            // utf-8 한글을 3Byte로 끊어 읽겠다.
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            System.out.println(responseJson);

            // 2번 자바 오브젝트로 변경
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);
            System.out.println("다운 받은 아이템 개수 : " + dto.getResponse().getBody().getTotalCount());

            String resultCode = dto.getResponse().getHeader().getResultCode();
            if (resultCode.equals(" 00")) { // 공백 00
                System.out.println("resultCode : " + resultCode);
                System.out.println("통신이 정상적으로 수행되지 않았습니다.");
                return; // 스택 종료!!
            }

            int totalCount = dto.getResponse().getBody().getTotalCount();
            if (totalCount == 0) {
                System.out.println("통신에 결과가 0건입니다.");
                return; // 스택종료
            }

            // 3번 현재 온도
            System.out.println("현재온도 : " + dto.getResponse().getBody().getItems().getItem().get(3).getObsrValue());
        } catch (Exception e) {
            // System.out.println("오류발생" + e.getMessage());
            e.printStackTrace();
        }

    }
}
