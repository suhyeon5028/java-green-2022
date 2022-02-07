package datacovid;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CovidDto {
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
                    private long accExamCnt; // 누적 의심신고 검사자
                    private String createDt; // 등록 일시분초
                    private int deathCnt; // 사망자 수
                    private int decideCnt; // 확진자 수
                    private int seq; // 게시글번호(감염현황 고유값)
                    private int stateDt; // 기준 일
                    private String stateTime; // 기준 시간
                    private String updateDt;// 수정 일시분초
                }
            }
        }
    }
}
