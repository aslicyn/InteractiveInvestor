package ii.co.uk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Pensions extends BasePage {


    @FindBy(xpath = "//h1/../ul/li")
    public List<WebElement> menuSecLocators;



}
