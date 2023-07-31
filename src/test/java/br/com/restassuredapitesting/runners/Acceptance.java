package br.com.restassuredapitesting.runners;
import br.com.restassuredapitesting.tests.viaCep.tests.GetViaCepTest;
import br.com.restassuredapitesting.tests.healthcheck.tests.GetHealthCheckTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Categories.class)
@Categories.IncludeCategory(br.com.restassuredapitesting.suites.Acceptance.class)
@Suite.SuiteClasses({
        GetViaCepTest.class,
        GetHealthCheckTest.class
})
public class Acceptance {
}
