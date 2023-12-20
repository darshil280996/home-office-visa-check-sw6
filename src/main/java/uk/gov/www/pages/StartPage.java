package uk.gov.www.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.gov.www.browserfactory.ManageBrowser;
import uk.gov.www.utilities.Utility;

public class StartPage extends Utility {

    private static final Logger log = LogManager.getLogger(ManageBrowser.class);

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Hide this message')]")
    WebElement hideMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNowButton;

    public void acceptCookies(){
        log.info("accept cookies");
        clickOnElement(acceptCookies);
    }

    public void clickHideMessage(){
        log.info("Click on hide message");
        clickOnElement(hideMessage);
    }

    public void clickStartNow(){
        log.info("CLick on start Button");
        clickOnElement(startNowButton);
    }

}
