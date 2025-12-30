package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class EcommerceTest extends BaseTest {

    @Test
    public void endToEndEcommerceTest() throws InterruptedException {

        LoginPage login = new LoginPage(driver);
        login.login("vsk@123", "vsk@123");

        HomePage home = new HomePage(driver);
        home.selectProduct();

        ProductPage product = new ProductPage(driver);
        product.addProductToCart();

        CartPage cart = new CartPage(driver);
        cart.verifyProductInCart();
    }
}
