package jsonex01;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class SMSDto {
    private String groupId;
    private int successCount;
    private int errorCount;
}

public class GsonEx02 {
    public static void main(String[] args) {
        // {"group_id":"R2GdEONszq64lNB9","success_count":1,"error_count":0}
        String smsReturn = "{\"groupId\":\"R2GdEONszq64lNB9\",\"successCount\":1,\"errorCount\":0}";
        System.out.println(smsReturn);

        Gson gson = new Gson();
        SMSDto javaDto = gson.fromJson(smsReturn, SMSDto.class);
        System.out.println(javaDto);

    }
}
