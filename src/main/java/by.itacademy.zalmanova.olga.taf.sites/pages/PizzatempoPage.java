package by.itacademy.zalmanova.olga.taf.sites.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class PizzatempoPage {
    private SafariDriver driver;
    private  String inputEmailAddressName  = "astroauth_login";
    private String inputPasswordName = "astroauth_pass";
    private String buttonSubmitName = "astroauth_submit";
    private String baseURL = "https://www.pizzatempo.by";
    private String AlertMessage = "Заполните форму";
    private String errorXpath = "//*[@id='alert']/div[2]/div[2]";
    public PizzatempoPage(SafariDriver newDriver) {
        driver = newDriver;
    }
    public void openBaseURL(){
        driver.get(baseURL);
    }
    public void clickSubmitButton() {
        WebElement buttonSubmit = driver.findElement(By.name(buttonSubmitName);
    buttonSubmit.click();
    }

    public void sendKeysInputEmail(String email) {;
        WebElement inputEmail = driver.findElement(By.name(inputEmailAddressName));
        inputEmail.sendKeys(email);
    }

    public void sendKeysInputPassword(String password) {
        WebElement inputPassword= driver.findElement(By.name(inputPasswordName));
        inputPassword.sendKeys(password);
    }
    public String getAlert(){

        Alert alert = driver.switchTo().alert();
        String AlertMessage = alert.getText();
        return AlertMessage;
    }

    public void getError(){

        WebElement actError = driver.findElement(By.xpath(errorXpath));
        String actErrorMessage = actError.getText();
        String expErrorMessage = "Неверно указано имя пользователя или пароль.\n" +
                "Ok";
        Assertions.assertEquals(expErrorMessage, actErrorMessage);
    }
    }