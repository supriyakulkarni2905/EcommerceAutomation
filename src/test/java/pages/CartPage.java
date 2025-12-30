package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By cartMenu = By.id("cartur");
    By productRow = By.xpath("//tr[@class='success']");

    public void verifyProductInCart() {
        driver.findElement(cartMenu).click();
        Assert.assertTrue(driver.findElement(productRow).isDisplayed());
    }
}
