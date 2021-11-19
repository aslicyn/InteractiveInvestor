package ii.co.uk.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.*;


public class BrowserUtils {

    /**
     * Performs an active pause
     */
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * GET current URL
     */
    public static String getURL() {
        return Driver.get().getCurrentUrl();
    }


    /**
     * Element Presented or not
     */
    public static boolean isElementPresent(WebElement element){
        try{
            element.isDisplayed();
            return true;
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor)Driver.get()).executeScript("arguments[0].scrollIntoView(true);",element);
    }

}