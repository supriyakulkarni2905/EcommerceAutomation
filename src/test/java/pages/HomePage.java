package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By firstProduct = By.xpath("(//a[@class='hrefch'])[1]");

    public void selectProduct() {
        driver.findElement(firstProduct).click();
    }
}
