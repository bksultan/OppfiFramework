package api;

import api.models.Error;
import api.models.ResponseBody;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
    RequestBuilder requestBuilder = new RequestBuilder();

    @Test
    public void testThatGetsAnOfferStatusApproved() {
        Response response = requestBuilder.post("123456780", 2800, "FL");
        response.prettyPrint();

        Assert.assertEquals("APPROVED", response.as(ResponseBody.class).getStatus(), "Status of Offer");
        Assert.assertEquals("Jane", response.as(ResponseBody.class).getRequest().getPersonalInfo().getFirstName(), "Validate the First name");
        Assert.assertEquals("Smith", response.as(ResponseBody.class).getRequest().getPersonalInfo().getLastName(), "Validate the Last name");
    }

    @Test
    public void testThatGetsAnOfferStatusDeclined() {
        Response response = requestBuilder.post("");
        response.prettyPrint();

        Assert.assertEquals("DECLINED", response.as(ResponseBody.class).getStatus(), "Status of Offer");
    }

    @Test
    public void testThatGetsAnError() {
        Response response = requestBuilder.incorrectPost("");
        response.prettyPrint();

        Assert.assertEquals("Failed partner auth", response.as(Error.class).getError(), "Error status");
    }
}
