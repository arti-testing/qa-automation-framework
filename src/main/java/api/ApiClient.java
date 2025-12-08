package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiClient {

    public static Response get(String url) {
        return RestAssured
                .given()
                .when()
                .get(url)
                .then()
                .extract()
                .response();
    }

    public static Response post(String url, Object body) {
        return RestAssured
                .given()
                .contentType("application/json")
                .body(body)
                .when()
                .post(url)
                .then()
                .extract()
                .response();
    }
}
