package by.itacademy.zalmanova.olga.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class BookingTest {
    BookingPage bookingPage;
    SafariDriver driver;

    @BeforeEach
    public void test() {
        bookingPage = new BookingPage();
        driver = new SafariDriver();
        driver.get("http://www.booking.com");
        driver.manage().window().maximize();
    }

    @Test
    public void testEmptyEmail() {

       bookingPage.clickLoginButton(driver);
       bookingPage.clickContinueButton(driver);
    }

    @Test
    public void testInvalidEmail() {

       bookingPage.clickLoginButton(driver);
       bookingPage.sendKeysInputEmail(driver, "email");
       bookingPage.clickContinueButton(driver);
       bookingPage.clickSubmitButton(driver);
    }

    @Test
    public void testValidEmail() {
        bookingPage.clickLoginButton(driver);
        bookingPage.sendKeysInputEmail(driver, "email");
        bookingPage.clickContinueButton(driver);
        bookingPage.clickSubmitButton(driver);
    }

    @Test
    public void testValidEmailEmptyPassword() {

        bookingPage.clickLoginButton(driver);
        bookingPage.sendKeysInputEmail(driver, "email");
        bookingPage.clickContinueButton(driver);
        bookingPage.clickSubmitButton(driver);
    }

    @Test
    public void testValidEmailAndPassword() {

        bookingPage.clickLoginButton(driver);
        bookingPage.sendKeysInputEmail(driver, "email");
        bookingPage.clickContinueButton(driver);
        bookingPage.sendKeysInputPassword(driver,"54321");
        bookingPage.clickSubmitButton(driver);

    }

    @AfterEach
    public void tearsDown() {

        driver.quit();
    }
}
