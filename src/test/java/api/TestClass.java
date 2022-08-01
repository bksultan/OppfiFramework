package api;

import api.models.ResponseBody;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TestClass {
    RequestBuilder requestBuilder = new RequestBuilder();

    @Test
    public void approvedTest() {
        Response response = RequestBuilder.post();
        response.prettyPrint();

        String status = response.as(ResponseBody.class).getStatus();
        String code = response.as(ResponseBody.class).getCode();
        String firstName = response.as(ResponseBody.class).getRequest().getPersonalInfo().getFirstName();

        System.out.println(status);
        System.out.println(code);
        System.out.println(firstName);
    }


}
