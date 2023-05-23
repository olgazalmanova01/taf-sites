package by.itacademy.zalmanova.olga.taf.sites;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

    public class Tripadvisor {
        @Test
        public void test() {
            TripadvisorPage tripadvisorPage = new TripadvisorPage();
            WebDriver driver = new SafariDriver();
            driver.get("http://www.tripadvisor.com");
//            WebElement buttonAccessCookies = driver.findElement(By.xpath(tripadvisorPage.buttonAccessCookies));
//            buttonAccessCookies.click();
//            WebElement buttonClosePopup = driver.findElement(By.cssSelector(tripadvisorPage.buttonClosePopup));
//            buttonClosePopup.click();
            driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
            WebElement buttonContinueWithEmail = driver.findElement(By.xpath(tripadvisorPage.buttonContinueWithEmail));
            buttonContinueWithEmail.click();
//            WebElement buttonLogin = driver.findElement(By.cssSelector(tripadvisorPage.buttonLogin));
//            buttonLogin.click();
//            WebElement buttonContinueWithEmail = driver.findElement(By.cssSelector(tripadvisorPage.buttonContinueWithEmail));
//            buttonContinueWithEmail.click();
//            WebElement inputEmail = driver.findElement(By.cssSelector(tripadvisorPage.inputEmail));
//            inputEmail.sendKeys("Olga@gmail.com");
            WebElement inputPassword = driver.findElement(By.xpath(tripadvisorPage.inputPassword));
            inputPassword.sendKeys("123");
            WebElement buttonSubmit = driver.findElement(By.xpath(tripadvisorPage.buttonSubmit));
            buttonSubmit.click();

        }
    }