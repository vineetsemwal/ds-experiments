package designpatterns.builder;

public class ClientUsage {
    public static void main(String[] args) {
        CustomResponse.ResponseBuilder responseBuilder =CustomResponse.builder();
        CustomResponse response1=responseBuilder
                .setStatusCode(200)
                .addHeader("content-type","application/json")
                .addHeader("content-length","1024")
                .setBody("{\"name\":\"John\"}")
                .build();

        CustomResponse response2=CustomResponse.builder()
                .setStatusCode(201)
                .addHeader("content-type","application/text")
                .addHeader("content-length","32")
                .setBody("hello world")
                .build();
        System.out.println("response1="+response1.getBody()+"-"+response1.getStatusCode()+"-headers"+response1.getHeaders());

        System.out.println("response2="+response2.getBody()+"-"+response2.getStatusCode()+"-headers"+response2.getHeaders());



    }
}
