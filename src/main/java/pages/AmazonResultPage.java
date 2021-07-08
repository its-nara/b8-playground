package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.List;

public class AmazonResultPage {

    public AmazonResultPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
    public List<WebElement>itemsList;

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    public WebElement nameTag;

    public boolean checkItemsNumber(int expectedNumbers){
        return itemsList.size()>expectedNumbers;
    }

    public boolean checkSearchCriteria(String expectedCriteria){

        return nameTag.getText().trim().equalsIgnoreCase(expectedCriteria);

    }

}
