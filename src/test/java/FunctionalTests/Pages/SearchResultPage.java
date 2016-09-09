package FunctionalTests.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by vishal on 9/9/16.
 */
public class SearchResultPage extends HomePage {
    @FindBy(how = How.CSS, using = "a.a-link-normal.s-access-detail-page.a-text-normal")
    public WebElement firstProductLink;

    public SearchResultPage() {
        PageFactory.initElements(driver, this);
    }

    public void initElements() {
        PageFactory.initElements(driver, this);
    }

    public void selectFirstProduct(){
        firstProductLink.click();
    }


}
