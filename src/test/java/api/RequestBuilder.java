package api;

import api.models.BuildBody;
import api.models.Envelope;
import api.models.post.PersonalInfo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RequestBuilder {
    static String baseURI = "https://partner-test.opploans.com/api/lde/v4/offer";
    static BuildBody buildBody = new BuildBody();

    public static Response post() {
        return given()
                .accept(ContentType.JSON)
                .with()
                .headers("x-api-key", "b813b584-6932-4d0a-909f-43ae22df452a")
                .when()
                .body(buildBody.offerBody())
                .post(baseURI)
                .thenReturn();
    }
}


