package by.itacademy.zalmanova.olga.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class DominosTest {
    DominosPage dominosPage = new DominosPage();
    SafariDriver driver;

    @BeforeEach
    public void beforeTest() {
        driver = new SafariDriver();
        driver.get("https://dominos.by/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void testWithInvalidEmailAndValidPassword() {

        WebElement buttonClose = driver.findElement(By.cssSelector(dominosPage.buttonClose));
        buttonClose.click();
        WebElement buttonSignInXpath = driver.findElement(By.xpath(dominosPage.buttonSignInXpath));
        buttonSignInXpath.click();
        WebElement inputEmailXpath = driver.findElement(By.xpath(dominosPage.inputEmailXpath));
        inputEmailXpath.sendKeys("email");
        WebElement inputPasswordXpath = driver.findElement(By.xpath(dominosPage.inputPasswordXpath));
        inputPasswordXpath.sendKeys("987123");
        WebElement buttonSubmitXpath = driver.findElement(By.xpath(dominosPage.buttonSubmitXpath));
        buttonSubmitXpath.click();
    }

    @Test
    public void testCorrectEmailPassword() {

        WebElement buttonSignInXpath = driver.findElement(By.xpath(dominosPage.buttonSignInXpath));
        buttonSignInXpath.click();
        WebElement inputEmailXpath = driver.findElement(By.xpath(dominosPage.inputEmailXpath));
        inputEmailXpath.sendKeys("olga@gmail.com");
        WebElement inputPasswordXpath = driver.findElement(By.xpath(dominosPage.inputPasswordXpath));
        inputPasswordXpath.sendKeys("987123");
        WebElement buttonSubmitXpath = driver.findElement(By.xpath(dominosPage.buttonSubmitXpath));
        buttonSubmitXpath.click();
    }

    @AfterEach
    public void theEnd() {
        driver.quit();
    }
}
