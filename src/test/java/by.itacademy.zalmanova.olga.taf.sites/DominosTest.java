package by.itacademy.zalmanova.olga.taf.sites;

import by.itacademy.zalmanova.olga.taf.sites.pages.DominosPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class DominosTest {
    DominosPage dominosPage;
    SafariDriver driver;

    @BeforeEach
    public void beforeTest() {
        driver = new SafariDriver();
        driver.get("https://dominos.by/");
        driver.manage().window().maximize();
        dominosPage = new DominosPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void testWithInvalidEmailAndValidPassword() {

        dominosPage.clickCloseButton(driver);
        dominosPage.clickSignInButton(driver);
        dominosPage.sendKeysInputEmail(driver, "email");
        dominosPage.sendKeysInputPassword(driver, "54321");
        dominosPage.clickSubmitButton(driver);
    }

    @Test
    public void testCorrectEmailPassword() {

        dominosPage.clickSignInButton(driver);
        dominosPage.sendKeysInputEmail(driver, "olgazalmanova085@gmail.com");
        dominosPage.sendKeysInputPassword(driver, "12345");
        dominosPage.clickSubmitButton(driver);
    }

    @AfterEach
    public void theEnd() {
        driver.quit();
    }
}
