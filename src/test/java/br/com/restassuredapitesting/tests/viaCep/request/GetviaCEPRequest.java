package br.com.restassuredapitesting.tests.viaCep.request;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class GetviaCEPRequest {
    @Step("Consultar CEP Válido.")
    public Response consultarCEPValido() {
        return given()
                .header("Content-Type", "application/json")
                .when()
                .get("91260241/json");
    }

    @Step("Consultar CEP Inválido.")
    public Response consultarCEPInvalido() {
        return given()
                .header("Content-Type", "application/json")
                .when()
                .get("99845999/json");
    }
}
