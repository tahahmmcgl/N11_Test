package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasketPage;
import util.DriverFactory;

public class BasketPageStep {
    BasketPage basketPage=new BasketPage(DriverFactory.getDriver());
    @When("remove product from Basket")
    public void removeProductFromBasket()  {
        basketPage.removeProduct();
    }

    @Then("you should see {string} message")
    public void youShouldSeeMessage(String basketMessage) {
        basketPage.seeMessage(basketMessage);
    }

    @When("check the basket button count {string}")
    public void checkTheBasketButtonCount(String basketBtnCount) {
    basketPage.checkBasket(basketBtnCount);
    }
}
