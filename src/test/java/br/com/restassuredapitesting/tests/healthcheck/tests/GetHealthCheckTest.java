package br.com.restassuredapitesting.tests.healthcheck.tests;
import br.com.restassuredapitesting.suites.Acceptance;
import br.com.restassuredapitesting.tests.base.tests.BaseTest;
import br.com.restassuredapitesting.tests.healthcheck.requests.GetHealthCheckRequest;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import org.apache.http.HttpStatus;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

@Feature("Via CEP - HealthCheck")
public class GetHealthCheckTest extends BaseTest {
    GetHealthCheckRequest getHealthCheckRequest = new GetHealthCheckRequest();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Category(Acceptance.class)
    @DisplayName("Verificar se API Via CEP está online")
    public void deveRetornar200_healthCheck() throws Exception {
        getHealthCheckRequest.healthCheck().then()
                .statusCode(HttpStatus.SC_OK);
    }
}


