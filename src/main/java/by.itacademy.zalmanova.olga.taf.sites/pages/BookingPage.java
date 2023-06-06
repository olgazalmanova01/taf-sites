package by.itacademy.zalmanova.olga.taf.sites.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class BookingPage {

    String buttonLoginXpath = "#b2indexPage > div.c85f9f100b.cb6c8dd99f > div > div > div > div.dd2db21cc4 > div > a";
    String inputEmailXpath = "//*[@id='username']";
    String inputPasswordXpath = "//*[@id='password']";
    String buttonContinueWithEmailXpath = "//*[@id='root']/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button";
    String buttonSubmitXpath = "//*[@id='root']/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[2]/button";

    public void clickLoginButton(SafariDriver driver) {

        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginXpath));
        buttonLogin.click();
    }
    public void sendKeysInputEmail(SafariDriver driver, String mail) {

        WebElement inputEmail = driver.findElement(By.xpath(inputEmailXpath));
        inputEmail.sendKeys("email");
    }
    public void sendKeysInputPassword(SafariDriver driver, String str) {

        WebElement inputPassword = driver.findElement(By.xpath(inputPasswordXpath));
        inputPassword.sendKeys("54321");
    }
    public void clickContinueButton(SafariDriver driver) {

        WebElement buttonContinueWithEmail = driver.findElement(By.xpath(buttonContinueWithEmailXpath));
        buttonContinueWithEmail.click();
    }
    public void clickSubmitButton(SafariDriver driver) {

        WebElement buttonSubmit = driver.findElement(By.xpath(buttonSubmitXpath));
        buttonSubmit.click();
}
}

