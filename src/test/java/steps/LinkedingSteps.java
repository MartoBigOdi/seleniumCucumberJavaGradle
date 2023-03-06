package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LinkedingPage;

public class LinkedingSteps {

    LinkedingPage linkedingPage = new LinkedingPage();

    @Given("^I am on the Marto's Profile Linkeding page$")
    public void navigateToLinkedingFeed(){
        linkedingPage.navigateToLinkeding();
    }


    @And("^I close the modal that has been opened$")
    public void closeModal(){
        linkedingPage.clickCloseModal();
    }


    @Then("i see the profile of a QA JR automation")
    public void validateResultProfile(){
        Assert.assertEquals("2K followers" ,linkedingPage.firstResult());
    }


}
