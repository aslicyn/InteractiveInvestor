
package ii.co.uk.pages;

import ii.co.uk.utilities.BrowserUtils;
import ii.co.uk.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Services extends BasePage {

    @FindBy(xpath = "(//div[@class='css-18jmh3i'])[1]/div/a/span")
    public List<WebElement> tradingAccountButtons;

    @FindBy(xpath = "//h1/../ul/li")
    public List<WebElement> menuSecLocators;


    public void serviceMenu(String subsectionlink) {
        String sectionlocator ="//a[contains(text(),'"+subsectionlink+"')]";
        System.out.println("sectionlocator = " + sectionlocator);
        Driver.get().findElement(By.xpath(sectionlocator)).click();
    }

    public List<String> menuSubSections() {

        List<String> title= new ArrayList<>();
         for (WebElement element: menuSecLocators){
            String subtitle= element.getText();
            title.add(subtitle);
         }
        System.out.println("title = " + title);
        return title;
    }

    public List<String> getTradingAccountButtons() {
        tradingAccountButtons.forEach((element )->{
           assertThat ("buttons are not displayed", BrowserUtils.isElementPresent(element), is(true));
        });
        return tradingAccountButtons.stream().map(WebElement::getText).collect(Collectors.toList());
    }
}

