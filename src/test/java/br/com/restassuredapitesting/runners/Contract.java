package br.com.restassuredapitesting.runners;
import br.com.restassuredapitesting.tests.viaCep.contracts.ViaCepContratoTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Categories.class)
@Categories.IncludeCategory(br.com.restassuredapitesting.suites.Contract.class)
@Suite.SuiteClasses({
        ViaCepContratoTest.class,
})
public class Contract {
}