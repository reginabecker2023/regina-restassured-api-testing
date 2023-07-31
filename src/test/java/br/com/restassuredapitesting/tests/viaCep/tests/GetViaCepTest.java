package br.com.restassuredapitesting.tests.viaCep.tests;
import br.com.restassuredapitesting.suites.Acceptance;
import br.com.restassuredapitesting.suites.Contract;
import br.com.restassuredapitesting.tests.base.tests.BaseTest;
import br.com.restassuredapitesting.tests.viaCep.request.GetviaCEPRequest;
import br.com.restassuredapitesting.utils.Utils;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import org.apache.http.HttpStatus;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import java.io.File;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.*;
@Feature("ViaCEP")
public class GetViaCepTest extends BaseTest {
    GetviaCEPRequest getviaCEPRequest = new GetviaCEPRequest();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Category(Acceptance.class)
    @DisplayName("Consultar CEP Válido")
    public void validarCepValido() throws Exception {
        getviaCEPRequest.consultarCEPValido().then()
                .statusCode(HttpStatus.SC_OK)
                .body("size()", greaterThan(0))
                .body("cep", equalTo("91260-241"))
                .body("logradouro", equalTo("Rua Ernesto Zamprogna"))
                .body("complemento", notNullValue())
                .body("bairro", equalTo("Morro Santana"))
                .body("localidade", equalTo("Porto Alegre"))
                .body("uf", equalTo("RS"))
                .body("ibge", equalTo("4314902"))
                .body("gia", notNullValue())
                .body("ddd", equalTo("51"))
                .body("siafi", equalTo("8801"));
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Category(Acceptance.class)
    @DisplayName("Consultar CEP Inválido")
    public void validarCepInvalido() throws Exception {
        getviaCEPRequest.consultarCEPInvalido().then()
                .statusCode(HttpStatus.SC_OK)
                .body("size()", greaterThan(0))
                .assertThat()
                .assertThat().body("erro", is(true));
    }
}