package FunctionalTests.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by vishal on 9/9/16.
 */
public class ProductPage extends SearchResultPage {
    @FindBy(how = How.ID, using = "productTitle")
    public WebElement productTitle;

    @FindBy(how = How.ID, using = "title_feature_div")
    public WebElement authorNames;

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    public void initElements() {
        PageFactory.initElements(driver, this);
    }

    public String getProductTitle(){
        return productTitle.getText();
    }

    public String getAuthorInformation(){
        return authorNames.getText();
    }
}
