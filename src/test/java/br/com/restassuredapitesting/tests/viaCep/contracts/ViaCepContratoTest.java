package br.com.restassuredapitesting.tests.viaCep.contracts;
import br.com.restassuredapitesting.suites.Acceptance;
import br.com.restassuredapitesting.suites.Contract;
import br.com.restassuredapitesting.tests.base.tests.BaseTest;
import br.com.restassuredapitesting.tests.viaCep.request.GetviaCEPRequest;
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
public class ViaCepContratoTest extends BaseTest {
    GetviaCEPRequest getviaCEPRequest = new GetviaCEPRequest();

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Category(Contract.class)
    @DisplayName("Garantir o Contrato da API VIACEP")
    public void deveRetornar200_validacaoContrato_getViaCep() throws Exception {
        getviaCEPRequest.consultarCEPValido().then()
                .statusCode(HttpStatus.SC_OK)
                .body(matchesJsonSchema(new File("src/test/resources/json_schema/get_viacep.json")));
    }
}  
