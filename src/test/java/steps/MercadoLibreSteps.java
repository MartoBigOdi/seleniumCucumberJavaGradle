package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MercadoLibrePage;

public class MercadoLibreSteps {

    MercadoLibrePage mercadoLibrePage = new MercadoLibrePage();

    @Given("^I am on the Mercado Libre search page$")
    public void navigateToMercadoLibre(){
        mercadoLibrePage.navigateToMercadoLibre();
    }

    @When("^I enter a search criteria$")
    public void enterSearchCriteria(){
        mercadoLibrePage.enterSearchCriteria("Razer Blade 15 base model");
    }

    @And("^click on the search button$")
    public void clickButtonSearch(){
        mercadoLibrePage.clickMercadoSearch();
    }

    @Then("the results match the criteria")
    public void validateResultMatch(){

    }
}
