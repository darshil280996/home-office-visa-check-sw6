package uk.gov.www.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.gov.www.browserfactory.ManageBrowser;
import uk.gov.www.utilities.Utility;

public class DurationOfStayPage extends Utility {

    private static final Logger log = LogManager.getLogger(ManageBrowser.class);

    //nextStepButton, lessThanSixMonths, moreThanSixMonths locators
    @CacheLookup
    @FindBy(id = "response-1")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement lessThanSixMonths;



    //create methods 'void selectLengthOfStay(String moreOrLess)'
    // (Note: use switch statement for select moreOrLess stay) and 'void clickNextStepButton()'

    public void select6monthsOrLess() {
        log.info("select 6 months or less");
        clickOnElement(lessThanSixMonths);
    }
    public void selectMoreThen6months(){
        log.info("Select More Then 6months");
        clickOnElement(moreThanSixMonths);
    }



}
