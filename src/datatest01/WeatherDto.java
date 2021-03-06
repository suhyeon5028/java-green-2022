package datatest01;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class WeatherDto {
    private Response response;

    @AllArgsConstructor
    @Data
    class Response {
        private Header header;

        private Body body;

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
            private int pageNo;
            private int numOfRows;
            private int totalCount;

            @AllArgsConstructor
            @Data
            class Items {

                private List<Item> item;

                @AllArgsConstructor
                @Data
                class Item {
                    private String baseDate;
                    private String baseTime;
                    private String category;
                    private int nx;
                    private int ny;
                    private String obsrValue;
                }
            }
        }
    }
}