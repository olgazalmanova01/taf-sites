package by.itacademy.zalmanova.olga.taf.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class PizzatempoPage {
    SafariDriver driver;
    String nameEmail  = "astroauth_login";
    String namePassword = "astroauth_pass";
    String nameSubmitButton = "astroauth_submit";
    public PizzatempoPage(SafariDriver driver) {
    }


    public void clickSubmitButton(SafariDriver driver) {

        WebElement buttonSubmit = driver.findElement(By.xpath(nameSubmitButton));
    buttonSubmit.click();
    }

    public void sendKeysInputEmail(String mail) {;
        WebElement inputEmail = driver.findElement(By.xpath(nameEmail));
        inputEmail.sendKeys("email");
    }

    public void sendKeysInputPassword(SafariDriver driver, String str) {
        WebElement inputPassword= driver.findElement(By.xpath(namePassword));
        inputPassword.sendKeys("123");
    }

    }