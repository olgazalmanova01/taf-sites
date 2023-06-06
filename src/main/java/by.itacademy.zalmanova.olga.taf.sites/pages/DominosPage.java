package by.itacademy.zalmanova.olga.taf.sites.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class DominosPage {

    String buttonCloseXpath = "//*[@id=\"challenge-stage\"]/div/label/input";
    String buttonSignInXpath = "//*[@id=\"app-root\"]/div/div[1]/div[1]/div/div[4]/div/div/div[3]/button";
    String inputEmailXpath = "/html/body/div[3]/div[2]/div/div/div/div[2]/div[2]/div/form/div/div[1]/input";
    String inputPasswordXpath = "/html/body/div[3]/div[2]/div/div/div/div[2]/div[2]/div/form/div/div[2]/input";
    String buttonSubmitXpath = "/html/body/div[3]/div[2]/div/div/div/div[2]/div[2]/div/form/div/button";

    public void clickCloseButton(SafariDriver driver) {

        WebElement buttonClose = driver.findElement(By.xpath(buttonCloseXpath));
        buttonClose.click();
    }

    public void clickSignInButton(SafariDriver driver) {

        WebElement buttonSignIn = driver.findElement(By.xpath(buttonSignInXpath));
        buttonSignIn.click();
    }

    public void clickSubmitButton(SafariDriver driver) {

        WebElement buttonSubmit = driver.findElement(By.xpath(buttonSubmitXpath));
        buttonSubmit.click();
    }

    public void sendKeysInputEmail(SafariDriver driver, String mail) {
        WebElement inputEmail = driver.findElement(By.xpath(inputEmailXpath));
        inputEmail.sendKeys("olgazalmanova085@gmail.com");
    }

    public void sendKeysInputPassword(SafariDriver driver, String str) {
        WebElement inputPassword = driver.findElement(By.xpath(inputPasswordXpath));
        inputPassword.sendKeys("12345");
    }
}
