package uk.gov.www.steps;

import io.cucumber.java.en.Then;
import uk.gov.www.pages.SelectNationalityPage;

public class CountryDropDownSteps {
    @Then("I can see following {string} into dropdown")
    public void iCanSeeFollowingCountryIntoDropdown(String country) {
        new SelectNationalityPage().nationalityDropDownList(country);
        System.out.println(country);
    }
}
