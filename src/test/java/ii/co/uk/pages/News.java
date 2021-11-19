package ii.co.uk.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class News extends BasePage {

    @FindBy(className = "css-1tp4as7")
    public WebElement allDropDown;

    @FindBy(xpath ="//p[contains(text(),'Meet the experts')]")
    public WebElement meetTheExpert;

    @FindBy(css ="p.chakra-text.css-kpt9dv")
    public List<WebElement> allExpertName;


    public List<String> allExpertNames(int expectedNumber) {
        int actualNumber=0;
        List<String> title= new ArrayList<>();
        for (WebElement element: allExpertName){
            String subtitle= element.getText();
            title.add(subtitle);
            actualNumber++;
        }
        Assert.assertEquals("the number of expert = "+expectedNumber, expectedNumber,actualNumber);
        System.out.println("title = " + title);
        return title;
    }


}
