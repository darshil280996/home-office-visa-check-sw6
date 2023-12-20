package uk.gov.www.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.gov.www.browserfactory.ManageBrowser;
import uk.gov.www.utilities.Utility;

public class WorkTypePage extends Utility {

    private static final Logger log = LogManager.getLogger(ManageBrowser.class);

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement selectJobTypeList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;


    public void selectJobType() {
        log.info("Select job type");

        clickOnElement(selectJobTypeList);

    }

    public void clickNextStepButton() {
        log.info("Click next step Button");

        clickOnElement(nextStepButton);

    }
}
