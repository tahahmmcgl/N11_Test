package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

public class BasketPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By removeBtn = By.cssSelector(".removeProd.svgIcon.svgIcon_trash");
    By title = By.cssSelector(".cartEmptyText .title");
    By warningMessage = By.cssSelector(".btnHolder .btn.btnBlack");
    By basketNum=By.cssSelector("span.basketTotalNum");

    public BasketPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }


    public void removeProduct() {
        wait.until(ExpectedConditions.presenceOfElementLocated(warningMessage));
        wait.until(ExpectedConditions.presenceOfElementLocated(removeBtn));
        driver.findElement(warningMessage).click();
        driver.findElement(removeBtn).click();
    }

    public void seeMessage(String message) {
        wait.until(ExpectedConditions.presenceOfElementLocated(title));
        driver.findElement(title).getText().contains(message);

    }
    public void checkBasket(String count){
        wait.until(ExpectedConditions.presenceOfElementLocated(basketNum));
        driver.findElement(basketNum).getText().contains(count);

    }
}
