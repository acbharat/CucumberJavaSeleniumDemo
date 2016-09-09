package FunctionalTests.Testcases.StepDef;
import FunctionalTests.Pages.HomePage;
import FunctionalTests.Pages.ProductPage;
import FunctionalTests.Pages.SearchResultPage;
import com.amazon.basepage.ReadFromPropertiesFile;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by vishal on 9/9/16.
 */
public class AmazonProductSearchSteps {
    public static String exeEnvironment = "uat";
    public static String getExeEnvironment() {
        return exeEnvironment;
    }
    public static ReadFromPropertiesFile readFromPropertiesFile = new ReadFromPropertiesFile(getExeEnvironment());

    public HomePage homePage;
    public SearchResultPage searchResultPage;
    public ProductPage productPage;

        @Before
        public void beforeScenario(Scenario scenario) throws Exception {
            homePage = new HomePage();
            homePage.prepare(scenario);
            homePage.initElements();
            searchResultPage = new SearchResultPage();
            productPage = new ProductPage();
        }

        @After
        public void afterScenario(Scenario scenario) throws Throwable {
            homePage.cleanUp(scenario);
        }


    @Given("^I am on (amazon homepage)$")
    public void I_am_on_amazon_homepage(String baseEnv) throws Throwable {
        String baseUrl = readFromPropertiesFile.readPropertiesFile("appUrl");
        homePage.navigateTo(baseUrl);
    }

    @When("^I search for(.*)$")
    public void I_search_for(String searchQuery) throws Throwable {
        homePage.searchForListing(searchQuery);
    }

    @And("^I select the first product$")
    public void I_select_the_first_product$() throws Throwable {
        searchResultPage.selectFirstProduct();
    }

    @Then("^I should see the product title is (.*)$")
    public void I_should_see_the_product_title_is_title(String expectedTitle) throws Throwable {
        assertEquals(expectedTitle, productPage.getProductTitle());
    }

    @And("^I should see authors are (.*) and (.*)$")
    public void I_should_see_authors_are_authors(String auth1, String auth2) throws Throwable {
        assertTrue(productPage.getAuthorInformation().contains(auth1));
        assertTrue(productPage.getAuthorInformation().contains(auth2));
    }
}
