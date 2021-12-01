package org.naic.api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;

import java.util.ArrayList;

public class PetStoreApi {
    @Test
    public void getallPetTest(){

        String url="https://petstore.swagger.io/v2/pet/findByStatus" ;

        ArrayList<String> petStatus=new ArrayList<String>();
        petStatus.add("available");
        petStatus.add("pending");
        petStatus.add("sold");
        for(String status:petStatus) {
            RestAssured
                    .given()
                    .baseUri(url)
                    .contentType(ContentType.JSON)
                    .queryParam(status, petStatus)
                    .param(status)
                    .when()
                    .get()
                    .then()
                    .assertThat()
                    .statusCode(200);
        }
    }
}
