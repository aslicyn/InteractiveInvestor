package ii.co.uk.step_definitions;

import ii.co.uk.pages.News;
import ii.co.uk.utilities.BrowserUtils;
import io.cucumber.java.en.*;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class newsBarFlowSteps {

    News news= new News();

    @Given("the user scroll down the page till {string} and click {string}")
    public void the_user_scroll_down_the_page_till_and_click(String string, String string2) {
        BrowserUtils.waitFor(1);
        BrowserUtils.scrollToElement(news.meetTheExpert);
    }

    @Then("the user should see the {int} experts")
    public void the_user_should_see_the_experts(int i,List<String> expertName) {
        List<String> actualsubSections=news.allExpertNames(i);
        assertThat("subSections are not matched",actualsubSections,equalTo(expertName));


    }
}
