package api;

import api.models.ResponseBody;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TestClass {
    RequestBuilder requestBuilder = new RequestBuilder();

    @Test
    public void artistTest() {
        Response response = requestBuilder.post();
        response.prettyPrint();

        String status = response.as(ResponseBody.class).getStatus();
        String firstName = response.as(ResponseBody.class).getRequest().getPersonalInfo().getFirstName();

        System.out.println(status);
        System.out.println(firstName);
    }
}
