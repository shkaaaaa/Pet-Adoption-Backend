package com.anushka.petAdoption.Model;

public class APIResponse {
    Integer statusCode;
    String errorMessage;
    Object response;

    public APIResponse(Integer statusCode, String errorMessage, Object response) {
        this.statusCode = statusCode;
        this.errorMessage = errorMessage;
        this.response = response;
    }

    public APIResponse(){

    }

    public Integer getStatusCode(int i) {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }
}
