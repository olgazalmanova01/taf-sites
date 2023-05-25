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
    BookingPage bookingPage = new BookingPage();
    SafariDriver driver;

    @BeforeEach
    public void test() {

        WebDriver driver = new SafariDriver();
        driver.get("http://www.booking.com");
        driver.manage().window().maximize();
    }

    @Test
    public void testEmptyEmail() {

        WebElement buttonLoginXpath = driver.findElement(By.xpath(bookingPage.buttonloginXpath));
        buttonLoginXpath.click();
        WebElement buttonContinueWithEmail = driver.findElement(By.xpath(bookingPage.buttonContinueWithEmail));
        buttonContinueWithEmail.click();
    }

    @Test
    public void testInvalidEmail() {

        WebElement buttonLoginXpath = driver.findElement(By.xpath(bookingPage.buttonloginXpath));
        buttonLoginXpath.click();
        WebElement inputEmailXpath = driver.findElement(By.xpath(bookingPage.inputEmailXpath));
        inputEmailXpath.sendKeys("test");
        WebElement buttonContinueWithEmail = driver.findElement(By.xpath(bookingPage.buttonContinueWithEmail));
        buttonContinueWithEmail.click();
    }

    @Test
    public void testValidEmail() {
        WebElement buttonLoginXpath = driver.findElement(By.xpath(bookingPage.buttonloginXpath));
        buttonLoginXpath.click();
        WebElement inputEmailXpath = driver.findElement(By.xpath(bookingPage.inputEmailXpath));
        inputEmailXpath.sendKeys("test@gmail.com");
        WebElement buttonContinueWithEmail = driver.findElement(By.xpath(bookingPage.buttonContinueWithEmail));
        buttonContinueWithEmail.click();
    }

    @Test
    public void testValidEmailEmptyPassword() {

        WebElement buttonLoginXpath = driver.findElement(By.xpath(bookingPage.buttonloginXpath));
        buttonLoginXpath.click();
        WebElement inputEmailXpath = driver.findElement(By.xpath(bookingPage.inputEmailXpath));
        inputEmailXpath.sendKeys("test@gmail.com");
        WebElement buttonContinueWithEmail = driver.findElement(By.xpath(bookingPage.buttonContinueWithEmail));
        buttonContinueWithEmail.click();
        WebElement buttonSubmitXpath = driver.findElement(By.xpath(bookingPage.buttonSubmitXpath));
        buttonSubmitXpath.click();
    }

    @Test
    public void testValidEmailAndPassword() {

        WebElement buttonLoginXpath = driver.findElement(By.xpath(bookingPage.buttonloginXpath));
        buttonLoginXpath.click();
        WebElement inputEmailXpath = driver.findElement(By.xpath(bookingPage.inputEmailXpath));
        inputEmailXpath.sendKeys("test@gmail.com");
        WebElement buttonContinueWithEmail = driver.findElement(By.xpath(bookingPage.buttonContinueWithEmail));
        buttonContinueWithEmail.click();
        WebElement inputPasswordXpath = driver.findElement(By.xpath(bookingPage.inputPasswordXpath));
        inputPasswordXpath.sendKeys("123");
        WebElement buttonSubmitXpath = driver.findElement(By.xpath(bookingPage.buttonSubmitXpath));
        buttonSubmitXpath.click();
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
