package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.HomePage;
import org.junit.Assert;

public class HomePageSteps {

    private HomePage homePage;

    @Step
    public void clickSubscribeButton(){
        homePage.SubscribeButton();
    }

    @Step
    public void checkInvalidNewsletterEntryErrMsgIsDisplayed(){
        Assert.assertTrue("Invalid newsletter error message is not displayed", homePage.invalidNewsletterEntryErrMsg.isDisplayed());
    }

    @Step
    public void checkSuccessfulSubscriptionIsDipslayed(){
        homePage.successfulSubscription();

    }
    @Step
    public void typeNewsLetterAddress(){
        homePage.typeNewsletterEmail();
    }

}
