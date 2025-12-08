package tests.api;

import api.ApiClient;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleApiTests {

    @Test
    public void verifyGetCallReturns200() {
        String baseUrl = "https://reqres.in";
        String endpoint = "/api/users?page=2";

        Response response = ApiClient.get(baseUrl, endpoint);

        Assert.assertEquals(response.getStatusCode(), 200,
                "Status code should be 200 for successful GET call");
    }
}
