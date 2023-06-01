package by.itacademy.zalmanova.olga.taf.sites;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.safari.SafariDriver;

public class PizzatempoTest {
    SafariDriver driver;
    PizzatempoPage pizzatempoPage;
    PizzaTempoStep pizzaTempoStep;
    Util util;

    @BeforeEach
    public void beforeTest() {
        driver = new SafariDriver();
        driver.get("https://www.pizzatempo.by/");
        driver.manage().window().maximize();
        pizzatempoPage = new PizzatempoPage(driver);
        pizzaTempoStep = new PizzaTempoStep(driver);
    }

    @Test
    public void testEmptyEmailAndPassword() {

       pizzaTempoStep.fillLoginForm("", "");
    }

    @Test
    public void testWithWrongEmail() {

        pizzatempoPage.sendKeysInputEmail(Util.generateEmail());
        pizzatempoPage.sendKeysInputPassword(driver, Util.generatePassword());
        pizzatempoPage.clickSubmitButton(driver);
    }

    @Test
    public void testWithEmptyEmail() {

        pizzatempoPage.sendKeysInputPassword(driver, Util.generatePassword());
        pizzatempoPage.clickSubmitButton(driver);
    }

    @Test
    public void testWithEmptyPassword() {
        pizzatempoPage.sendKeysInputEmail(Util.generateEmail());
        pizzatempoPage.clickSubmitButton(driver);
    }

    @Test
    public void testValidEmailAndPassword() {
        pizzatempoPage.sendKeysInputEmail("olgazalmanova085@gmail.com");
        pizzatempoPage.sendKeysInputPassword(driver,"Fraser01");
        pizzatempoPage.clickSubmitButton(driver);

    }

    @AfterEach
    public void theEnd()  {
        driver.quit();
    }
}



