package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import util.DriverFactory;

public class HomePageStep {
    HomePage homePage=new HomePage(DriverFactory.getDriver());

    @Given("User is HomePage")
    public void userIsHomePage() {
        homePage.checkHomePage();
    }

    @When("you write {string} to search box")
    public void youWriteToSearchBox(String searchText) {
        homePage.writeSearchBox(searchText);
    }

    @When("click search button")
    public void clickSearchButton() {
        homePage.clickSearchButton();
    }
}
