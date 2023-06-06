package by.itacademy.zalmanova.olga.taf.sites.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class TripadvisorPage {


    String buttonLoginXpath = "//*[@id='lithium-root']/header/div/nav/div/div[2]/a[3]/span";
    String buttonContinueWithEmailXpath = "//*[@id='ssoButtons']/button/span[2]";
    String inputEmailXpath = "//*[@id='regSignIn.email']";
    String inputPasswordXpath = "//*[@id='regSignIn.password']";
    String buttonSubmitXpath = "//*[@id='regSignIn']/div[4]/button[1]";

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

