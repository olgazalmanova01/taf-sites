package by.itacademy.zalmanova.olga.taf.sites;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

    public class TripadvisorTest {
        TripadvisorPage tripadvisorPage;
        SafariDriver driver;

        @BeforeEach
        public void beforeTest() {
        driver = new SafariDriver();
        tripadvisorPage = new TripadvisorPage();
        driver.get("http://www.tripadvisor.com");
        driver.manage().window().maximize();
        }

        @Test
        public void testEmptyEmail() {

        tripadvisorPage.clickLoginButton(driver);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
        tripadvisorPage.clickContinueButton(driver);
        tripadvisorPage.clickSubmitButton(driver);
        }

        @Test
        public void testInvalidEmail() {

            tripadvisorPage.clickLoginButton(driver);
            driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
            tripadvisorPage.clickContinueButton(driver);
            tripadvisorPage.sendKeysInputEmail(driver, "email");
            tripadvisorPage.clickSubmitButton(driver);
        }

        @Test
        public void testWithWrongEmail() {

            tripadvisorPage.clickLoginButton(driver);
            driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
            tripadvisorPage.clickContinueButton(driver);
            tripadvisorPage.sendKeysInputEmail(driver, "email");
            tripadvisorPage.sendKeysInputPassword(driver, "54321");
            tripadvisorPage.clickSubmitButton(driver);

        }

        @Test
        public void testEmptyPassword() {

            tripadvisorPage.clickLoginButton(driver);
            driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
            tripadvisorPage.clickContinueButton(driver);
            tripadvisorPage.sendKeysInputEmail(driver, "email");
            tripadvisorPage.clickSubmitButton(driver);
        }

        @Test
        public void testCorrectEmailAndPassword() {
            tripadvisorPage.clickLoginButton(driver);
            driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
            tripadvisorPage.clickContinueButton(driver);
            tripadvisorPage.sendKeysInputEmail(driver, "email");
            tripadvisorPage.sendKeysInputPassword(driver, "54321");
            tripadvisorPage.clickSubmitButton(driver);
        }

        @AfterEach
        public void theEnd(){

            driver.quit();
        }
    }