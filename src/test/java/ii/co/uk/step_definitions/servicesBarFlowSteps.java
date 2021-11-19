package ii.co.uk.step_definitions;

import ii.co.uk.pages.Services;
import ii.co.uk.utilities.BrowserUtils;
import ii.co.uk.utilities.ConfigurationReader;
import ii.co.uk.utilities.Driver;
import io.cucumber.java.en.*;

import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class servicesBarFlowSteps {

    Services services= new Services();


    @Given("the user get the url")
    public void the_user_get_the_url() {
        Driver.get().get(ConfigurationReader.get("url"));
    }


    @When("the user click the {string} in dropdown of {string} bar")
    public void the_user_click_the_in_dropdown_of_bar(String subsectionlink, String barName) {
        services.setAcceptCookies(barName);
        if(!subsectionlink.isEmpty()){
            services.serviceMenu(subsectionlink);
        }


    }

    @When("the user should be directed to the URL {string}")
    public void the_user_should_be_directed_to_the_URL(String expectedURL) {
        BrowserUtils.waitFor(1);

        System.out.println("expectedURL = " + expectedURL);
        System.out.println("BrowserUtils.getURL() = " + BrowserUtils.getURL());
        assertEquals(expectedURL, BrowserUtils.getURL());
    }

    @Then("the user should see these links")
    public void the_user_should_see_these_links(List<String>subSections) {
        List<String> actualsubSections=services.menuSubSections();
        assertThat("subSections are not matched",actualsubSections,equalTo(subSections));
    }

    @Then("the user should see the buttons")
    public void the_user_should_see_the_buttons(List<String> buttonLinks) {
        assertThat("the buttons are missing",services.getTradingAccountButtons(),equalTo(buttonLinks));

    }



}
