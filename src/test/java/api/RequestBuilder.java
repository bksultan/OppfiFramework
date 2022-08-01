package api;

import api.models.BuildBody;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static api.ConfigReader.getProperty;
import static io.restassured.RestAssured.given;

public class RequestBuilder {
    static BuildBody buildBody = new BuildBody();

    public static Response post(String ssn) {
        return given()
                .accept(ContentType.JSON)
                .with()
                .headers("x-api-key", getProperty("x-api-key"))
                .when()
                .body(
                    buildBody.offerBody(ssn)
                )
                .post(getProperty("base-url"))
                .thenReturn();
    }

    public static Response post(String ssn, int income, String state) {
        return given()
                .accept(ContentType.JSON)
                .with()
                .headers("x-api-key", getProperty("x-api-key"))
                .when()
                .body(
                    buildBody.offerBody(ssn, income, state)
                )
                .post(getProperty("base-url"))
                .thenReturn();
    }

    public static Response incorrectPost(String ssn) {
        return given()
                .accept(ContentType.JSON)
                .with()
                .headers("x-api-key", getProperty("x-api-key") + "Error")
                .when()
                .body(
                        buildBody.offerBody(ssn)
                )
                .post(getProperty("base-url"))
                .thenReturn();
    }
}


