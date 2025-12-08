package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiClient {

    public static Response get(String baseUrl, String endpoint) {
        return RestAssured
                .given()
                .baseUri(baseUrl)
                .when()
                .get(endpoint)
                .then()
                .log().all()
                .extract()
                .response();
    }
}
