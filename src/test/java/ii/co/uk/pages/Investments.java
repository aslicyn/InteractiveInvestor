package ii.co.uk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;


public class Investments extends BasePage {

    @FindBy(className = "css-9y6172")
    public WebElement otherIndices;

    @FindBy(css = "a.css-pd8i5l")
    public List<WebElement> otherIndicesDropDown;

    public List<String> dropDownSection() {

        List<String> title= new ArrayList<>();
        for (WebElement element: otherIndicesDropDown){
            String subtitle= element.getText();
            title.add(subtitle);
        }
        System.out.println("title = " + title);
        return title;
    }

}
