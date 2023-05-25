package by.itacademy.zalmanova.olga.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

    public class TripadvisorTest {
        TripadvisorPage tripadvisorPage = new TripadvisorPage();
        SafariDriver driver;

        @BeforeEach
        public void beforeTest() {
        WebDriver driver = new SafariDriver();
        driver.get("http://www.tripadvisor.com");
        driver.manage().window().maximize();
        }

        @Test
        public void testEmptyEmail() {

        WebElement buttonLoginXpath = driver.findElement(By.xpath(tripadvisorPage.buttonLoginXpath));
        buttonLoginXpath.click();

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));

        WebElement buttonContinueWithEmail = driver.findElement(By.xpath(tripadvisorPage.buttonContinueWithEmail));
        buttonContinueWithEmail.click();
        WebElement buttonSubmitXpath = driver.findElement(By.xpath(tripadvisorPage.buttonSubmitXpath));
        buttonSubmitXpath.click();
        }

        @Test
        public void testInvalidEmail() {
            WebElement buttonLoginXpath = driver.findElement(By.xpath(tripadvisorPage.buttonLoginXpath));
            buttonLoginXpath.click();
            driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
            WebElement buttonContinueWithEmail = driver.findElement(By.xpath(tripadvisorPage.buttonContinueWithEmail));
            buttonContinueWithEmail.click();
            WebElement inputEmailXpath = driver.findElement(By.xpath(tripadvisorPage.inputEmailXpath));
            inputEmailXpath.sendKeys("test");
            WebElement buttonSubmitXpath = driver.findElement(By.xpath(tripadvisorPage.buttonSubmitXpath));
            buttonSubmitXpath.click();
        }

        @Test
        public void testWithWrongEmail() {
            WebElement buttonLoginXpath = driver.findElement(By.xpath(tripadvisorPage.buttonLoginXpath));
            buttonLoginXpath.click();
            driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
            WebElement buttonContinueWithEmail = driver.findElement(By.xpath(tripadvisorPage.buttonContinueWithEmail));
            buttonContinueWithEmail.click();
            WebElement inputEmailXpath = driver.findElement(By.xpath(tripadvisorPage.inputEmailXpath));
            inputEmailXpath.sendKeys("test");
            WebElement inputPasswordXpath = driver.findElement(By.xpath(tripadvisorPage.inputPasswordXpath));
            inputPasswordXpath.sendKeys("0108");
            WebElement buttonSubmitXpath = driver.findElement(By.xpath(tripadvisorPage.buttonSubmitXpath));
            buttonSubmitXpath.click();
        }

        @Test
        public void testEmptyPassword() {
            WebElement buttonLoginXpath = driver.findElement(By.xpath(tripadvisorPage.buttonLoginXpath));
            buttonLoginXpath.click();
            driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
            WebElement buttonContinueWithEmail = driver.findElement(By.xpath(tripadvisorPage.buttonContinueWithEmail));
            buttonContinueWithEmail.click();
            WebElement inputEmailXpath = driver.findElement(By.xpath(tripadvisorPage.inputEmailXpath));
            inputEmailXpath.sendKeys("test1@gmail.com");
            WebElement buttonSubmitXpath = driver.findElement(By.xpath(tripadvisorPage.buttonSubmitXpath));
            buttonSubmitXpath.click();
        }

        @Test
        public void testCorrectEmailAndPassword() {
            WebElement buttonLoginXpath = driver.findElement(By.xpath(tripadvisorPage.buttonLoginXpath));
            buttonLoginXpath.click();
            driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
            WebElement buttonContinueWithEmail = driver.findElement(By.xpath(tripadvisorPage.buttonContinueWithEmail));
            buttonContinueWithEmail.click();
            WebElement inputEmailXpath = driver.findElement(By.xpath(tripadvisorPage.inputEmailXpath));
            inputEmailXpath.sendKeys("test1@gmail.com");
            WebElement inputPasswordXpath = driver.findElement(By.xpath(tripadvisorPage.inputPasswordXpath));
            inputPasswordXpath.sendKeys("8763");
            WebElement buttonSubmitXpath = driver.findElement(By.xpath(tripadvisorPage.buttonSubmitXpath));
            buttonSubmitXpath.click();
        }

        @AfterEach
        public void theEnd(){
            driver.quit();
        }
    }