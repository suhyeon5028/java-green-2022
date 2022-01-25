package jsonex01;

import com.google.gson.Gson;

class SMSDto {
    private String groupId;
    private int successCount;
    private int errorCount;

    public SMSDto(String groupId, int i, int j) {
        this.groupId = groupId;
        this.successCount = i;
        this.errorCount = j;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public int getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(int successCount) {
        this.successCount = successCount;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

}

public class GsonEx02 {
    public static void main(String[] args) {
        // {"groupId":"R2GdEONszq64lNB9","successCount":1,"errorCount":0}
        String smsReturn = "{\"groupId\":\"R2GdEONszq64lNB9\",\"successCount\":1,\"errorCount\":0}";
        // System.out.println(smsReturn);
        SMSDto smsDto = new SMSDto("R2GdEONszq64lNB9", 1, 0);
        Gson gson = new Gson();
        String jsonSMSDto = gson.toJson(smsDto);
        System.out.println(jsonSMSDto);

        SMSDto javaSmsDto = gson.fromJson(jsonSMSDto, SMSDto.class);
        System.out.println(javaSmsDto.getGroupId());
        System.out.println(javaSmsDto.getSuccessCount());
        System.out.println(javaSmsDto.getErrorCount());
    }
}
