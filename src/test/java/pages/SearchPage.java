package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import sun.security.util.Length;
import util.ElementHelper;

import java.util.List;

public class SearchPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By filter= By.cssSelector(".filter.filterProductPoint input");
    By pageNum=By.cssSelector(".pagination a");
    By productList=By.cssSelector("h3.productName");

    public SearchPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void filterWithStars(String starsCount){
        wait.until(ExpectedConditions.presenceOfElementLocated(filter));
        boolean find = false;
        List<WebElement> elements = driver.findElements(filter);
        for (WebElement element : elements) {
            if (element.getAttribute("data-point").contains(starsCount)) {
                element.click();
                find = true;
                break;
            }
        }
        Assert.assertEquals(true, find);

    }
    public void clickPage(String pageNumber){
        wait.until(ExpectedConditions.presenceOfElementLocated(pageNum));
        boolean find=false;
        List<WebElement> elements=driver.findElements(pageNum);
        for (WebElement element :elements){
            if (element.getText().contains(pageNumber)){
                element.click();
                find=true;
                break;
            }
        }
        Assert.assertEquals(true,find);
    }
    public void clickProduct(String productName){
        wait.until(ExpectedConditions.presenceOfElementLocated(productList));
        boolean find=false;
        List<WebElement> elements=driver.findElements(productList);
        for (WebElement element :elements){
            if (element.getText().contains(productName)){
                element.click();
                find=true;
                break;
            }
        }
        Assert.assertEquals(true,find);
    }




}

