package uk.gov.www.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.gov.www.browserfactory.ManageBrowser;
import uk.gov.www.utilities.Utility;

public class SelectNationalityPage extends Utility {

    private static final Logger log = LogManager.getLogger(ManageBrowser.class);

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickNextStepButton;

    public void nationalityDropDownList(String nationality) {
        log.info("Select Nationality");
        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);
    }

    public void clickOnNextStepButton() {
        log.info("Click next step Button");
        clickOnElement(clickNextStepButton);
    }
}
