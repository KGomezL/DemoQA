package co.com.qvision.certificacion.demoqa.models.services.responses;

public class DataServiceResponse {
    String statusCode;

    public DataServiceResponse(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
