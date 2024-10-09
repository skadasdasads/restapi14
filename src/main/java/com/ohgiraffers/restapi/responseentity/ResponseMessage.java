package com.ohgiraffers.restapi.responseentity;


import java.util.Map;

public class ResponseMessage {


    private int httpStautsCode;
    private String message;
    private Map<String, Object> results;

    public ResponseMessage() {
    }


    public ResponseMessage(int httpStautsCode, String message, Map<String, Object> results) {
        this.httpStautsCode = httpStautsCode;
        this.message = message;
        this.results = results;
    }

    public int getHttpStautsCode() {
        return httpStautsCode;
    }

    public void setHttpStautsCode(int httpStautsCode) {
        this.httpStautsCode = httpStautsCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getResults() {
        return results;
    }

    public void setResults(Map<String, Object> results) {
        this.results = results;
    }



    @Override
    public String toString() {
        return "ResponseMessage{" +
                "httpStautsCode=" + httpStautsCode +
                ", message='" + message + '\'' +
                ", results=" + results +
                '}';
    }

}