package stepDefinitions;

import io.cucumber.java.en.When;
import pages.SearchPage;
import util.DriverFactory;

public class SearchPageStep {
    SearchPage searchPage=new SearchPage(DriverFactory.getDriver());
    @When("Filter out those with a product rating of {string} stars")
    public void filterOutThoseWithAProductRatingOfStars(String starsCount) {
        searchPage.filterWithStars(starsCount);
    }

    @When("click {string} page")
    public void clickPage(String pageNumber) {
        searchPage.clickPage(pageNumber);
    }

    @When("click {string} product")
    public void clickProduct(String productName) {
        searchPage.clickProduct(productName);
    }
}
