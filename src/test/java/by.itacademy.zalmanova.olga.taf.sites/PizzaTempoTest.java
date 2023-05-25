package by.itacademy.zalmanova.olga.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class PizzaTempoTest {
    PizzaTempoPage pizzaTempoPage = new PizzaTempoPage();
    SafariDriver driver;

    @BeforeEach
    public void beforeTest() {
        driver = new SafariDriver();
        driver.get("https://www.pizzatempo.by/");
        driver.manage().window().maximize();
    }

    @Test
    public void testEmptyEmailAndPassword() {

        WebElement buttonEnter = driver.findElement(By.xpath(pizzaTempoPage.buttonEnter));
        buttonEnter.click();
    }

    @Test
    public void testWithWrongEmail() {

        WebElement inputEmailXpath = driver.findElement(By.xpath(pizzaTempoPage.inputEmailXpath));
        inputEmailXpath.sendKeys("email");
        WebElement inputPasswordXpath = driver.findElement(By.xpath(pizzaTempoPage.inputPasswordXpath));
        inputPasswordXpath.sendKeys("987123");
        WebElement buttonEnter = driver.findElement(By.xpath(pizzaTempoPage.buttonEnter));
        buttonEnter.click();
    }

    @Test
    public void testWithEmptyEmail() {

        WebElement inputPasswordXpath = driver.findElement(By.xpath(pizzaTempoPage.inputPasswordXpath));
        inputPasswordXpath.sendKeys("987123");
        WebElement buttonEnter = driver.findElement(By.xpath(pizzaTempoPage.buttonEnter));
        buttonEnter.click();
    }

    @Test
    public void testWithEmptyPassword() {

        WebElement inputEmailXpath = driver.findElement(By.xpath(pizzaTempoPage.inputEmailXpath));
        inputEmailXpath.sendKeys("987123");
        WebElement buttonEnter = driver.findElement(By.xpath(pizzaTempoPage.buttonEnter));
        buttonEnter.click();
    }

    @Test
    public void testValidEmailAndPassword() {

        WebElement inputEmailXpath = driver.findElement(By.xpath(pizzaTempoPage.inputEmailXpath));
        inputEmailXpath.sendKeys("olgaz@gmail.com");
        WebElement inputPasswordXpath = driver.findElement(By.xpath(pizzaTempoPage.inputPasswordXpath));
        inputPasswordXpath.sendKeys("987123");
        WebElement buttonEnter = driver.findElement(By.xpath(pizzaTempoPage.buttonEnter));
        buttonEnter.click();
    }

    @AfterEach
    public void theEnd() {
        driver.quit();
    }
}



