package designpatterns.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomResponse {
    private int statusCode;
    private String statusMessage;
    private Map<String, String>headers;
    private String body;

    public int getStatusCode() {
        return statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public Map<String,String> getHeaders() {
        return headers;
    }


    public String getBody() {
        return body;
    }

    public static ResponseBuilder builder(){
        return new ResponseBuilder();
    }

    public static class ResponseBuilder{
        private CustomResponse customResponse=new CustomResponse();
        public ResponseBuilder(){
            customResponse.headers=new HashMap<>();
        }
        public ResponseBuilder setStatusCode(final int statusCode){
            customResponse.statusCode=statusCode;
            return this;
        }
        public ResponseBuilder setMessage(final String message){
            customResponse.statusMessage =message;
            return this;
        }
        public ResponseBuilder setBody(final String body){
            customResponse.body=body;
            return this;
        }
        ResponseBuilder addHeader(final String headerKey,String headerValue){
            customResponse.headers.put(headerKey,headerValue);
            return this;
        }

        public CustomResponse build(){
            return customResponse;
        }
    }


}
