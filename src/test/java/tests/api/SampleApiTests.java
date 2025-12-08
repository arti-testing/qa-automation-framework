package tests.api;

import api.ApiClient;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class SampleApiTests {

    ApiClient client = new ApiClient();

    @Test
    public void testGetUsers() {
        Response response = client.get("/api/users");
        System.out.println(response.asString());
    }

    @Test
    public void testGetUsersWithParams() {
        Map<String, String> params = new HashMap<>();
        params.put("page", "2");

        Response response = client.get("/api/users", params);
        System.out.println(response.asString());
    }
}
