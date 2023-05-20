package by.itacademy.zalmanova.olga.taf.sites;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class BookingTest {
    @Test
    public void testLogin() {
        BookingPage bookingPage = new BookingPage();
        WebDriver driver = new SafariDriver();
        driver.get("http://www.booking.com");
        WebElement buttonEnter = driver.findElement(By.xpath(bookingPage.buttonEnterXpath));
        buttonEnter.click();
        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXpath));
        inputEmail.sendKeys("Olga@gmail.com");
        WebElement buttonContinue = driver.findElement(By.xpath(bookingPage.buttonContinueXpath));
        buttonContinue.click();
        WebElement inputPassword = driver.findElement(By.xpath(bookingPage.inputPasswordXpath));
        inputEmail.sendKeys("123");

    }
}