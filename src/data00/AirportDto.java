package data00;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AirportDto {
    private Response response; // 변수명을 꼭 동일하게!!

    @AllArgsConstructor
    @Data
    class Response {
        private Header header; // 변수명을 꼭 동일하게!!

        private Body body; // 변수명을 꼭 동일하게!!

        @AllArgsConstructor
        @Data
        class Header {
            private String resultCode;
            private String resultMsg;

        }

        @AllArgsConstructor
        @Data
        class Body {
            private Items items;
            private int numOfRows;
            private int pageNo;

            private int totalCount;

            @AllArgsConstructor
            @Data
            class Items {

                private List<Item> item;

                @AllArgsConstructor
                @Data
                class Item {
                    private String airportId;
                    private String airportNm;
                }
            }
        }
    }
}
