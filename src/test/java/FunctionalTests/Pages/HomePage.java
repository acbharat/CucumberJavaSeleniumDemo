package FunctionalTests.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by vishal on 9/9/16.
 */
public class HomePage extends DriverConfig {

    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(how = How.CSS, using = "input.nav-input")
    private WebElement searchButton;



    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void initElements() {
        PageFactory.initElements(driver, this);
    }

    public HomePage navigateTo(String baseUrl) {
//        System.out.println("Navigating to " + arg1);
        driver.get(baseUrl);
        return this;
    }

    public String searchForListing(String searchQuery) {
        searchBox.clear();
        searchBox.sendKeys(searchQuery);
        searchButton.click();
        return searchQuery;
    }





}

