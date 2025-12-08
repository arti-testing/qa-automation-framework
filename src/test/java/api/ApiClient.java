package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import java.util.Map;

public class ApiClient {

    private static final String BASE_URL = "https://reqres.in";  // You can change later

    // Simple GET: /api/users
    public Response get(String endpoint) {
        return RestAssured
                .given()
                .baseUri(BASE_URL)
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }

    // GET with Query Params: /api/users?page=2
    public Response get(String endpoint, Map<String, String> params) {
        return RestAssured
                .given()
                .baseUri(BASE_URL)
                .queryParams(params)
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }
}
