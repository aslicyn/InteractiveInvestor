package ii.co.uk.step_definitions;

import ii.co.uk.pages.Investments;
import ii.co.uk.pages.Services;
import ii.co.uk.utilities.BrowserUtils;
import ii.co.uk.utilities.ConfigurationReader;
import ii.co.uk.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;

public class investmentsBarFlowSteps {

    Investments investments = new Investments();

    @Given("the user should click the {string}")
    public void the_user_should_click_the(String string) {
        BrowserUtils.waitFor(1);
        investments.otherIndices.click();
    }

    @Then("the user should see the dropdown")
    public void the_user_should_see_the_dropdown(List<String> dropdownList) {
        List<String> actualDropDownList=investments.dropDownSection();
        assertThat("subSections are not matched",actualDropDownList,equalTo(dropdownList));



    }

}
