package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    By addToCart = By.linkText("Add to cart");

    public void addProductToCart() throws InterruptedException {
        driver.findElement(addToCart).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }
}
