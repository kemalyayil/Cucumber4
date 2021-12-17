package pages;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class api_restAssured_body_parametreler {
    @Test
    public void test(){
        RestAssured.baseURI = "https://basicapitest.herokuapp.com";
        RequestSpecification request = RestAssured.given();
        request.header("Content-type","application/json");

        JSONObject datas = new JSONObject();
        datas.put("deneme",1234);
        datas.put("isim","Kemal");

        request.body(datas.toString());



    }
}
