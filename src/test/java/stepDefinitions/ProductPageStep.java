package stepDefinitions;

import io.cucumber.java.en.When;
import pages.ProductPage;
import util.DriverFactory;

public class ProductPageStep {
    ProductPage productPage=new ProductPage(DriverFactory.getDriver());
    @When("click add basket button")
    public void clickAddBasketButton() {
        productPage.clickAddBasketButton();
    }

    @When("click the basket button")
    public void clickBasketButton() {
        productPage.clickBasketButton();
    }
}
