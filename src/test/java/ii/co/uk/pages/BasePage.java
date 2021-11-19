package ii.co.uk.pages;


import ii.co.uk.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "css-9e6kxj")
    public List<WebElement> barOptions;

    public void navigateToModule(String date) {
        System.out.println("date = " + date);
        Driver.get().findElement(By.id("date-picker-day-"+ date)).click();

    }

    public void setAcceptCookies(String barOption) {
        String tabLocator ="//span[@title='"+barOption+"']";
        if(Driver.get().findElement(By.cssSelector("button.chakra-button.css-1ux3cye")).isDisplayed()){
            Driver.get().findElement(By.cssSelector("button.chakra-button.css-1ux3cye")).click();
            Driver.get().findElement(By.xpath(tabLocator)).click();
        }else{
            Driver.get().findElement(By.xpath(tabLocator)).click();
        }
    }


}
