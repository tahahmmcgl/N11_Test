package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By homePageElement= By.cssSelector(".group.setGroup.n11Group .unlineTitle");
    By searchBox=By.id("searchData");
    By searchBtn=By.cssSelector(".icon.iconSearch");

    public HomePage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void checkHomePage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(homePageElement));
        driver.findElement(homePageElement);
    }
    public void writeSearchBox(String searchText) {
        wait.until(ExpectedConditions.presenceOfElementLocated(searchBox));
        driver.findElement(searchBox).sendKeys(searchText);
    }
        public void clickSearchButton(){
            wait.until(ExpectedConditions.presenceOfElementLocated(searchBtn));
            driver.findElement(searchBtn).click();
    }

}



