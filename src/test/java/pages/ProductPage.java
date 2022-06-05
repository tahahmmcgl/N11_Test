package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class ProductPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By addBasketBtn= By.cssSelector(".btn.btnGrey.addBasketUnify");
    By basketBtn=By.cssSelector(".btn.btnBlack.btnGoBasket");

    public ProductPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickAddBasketButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(addBasketBtn));
        driver.findElement(addBasketBtn).click();
    }
    public void clickBasketButton(){

        wait.until(ExpectedConditions.presenceOfElementLocated(basketBtn));
        driver.findElement(basketBtn).click();
    }

}

