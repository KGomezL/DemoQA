package co.com.qvision.certificacion.demoqa.models.services.responses;

import java.util.List;
import java.util.Map;

public class BodyUserResponse extends DataServiceResponse{
    String code, message;

    public BodyUserResponse(String code, String message,  String statusCode) {
        super(statusCode);
        this.code = code;
        this.message = message;
    }

    public BodyUserResponse(List<Map<String, String>> dataMap) {
        super(dataMap.get(0).get("statusCode"));
        this.code = dataMap.get(0).get("code");
        this.message = dataMap.get(0).get("message");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "{\"code\":\""+this.code+"\",\"message\":\""+this.message+"\"}";
    }
}
