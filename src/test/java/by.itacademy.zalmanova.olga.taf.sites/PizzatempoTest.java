package by.itacademy.zalmanova.olga.taf.sites;


import by.itacademy.zalmanova.olga.taf.sites.pages.PizzatempoPage;
import by.itacademy.zalmanova.olga.taf.sites.steps.PizzaTempoStep;
import by.itacademy.zalmanova.olga.taf.sites.utils.Util;
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
    public void warmUp() {
        driver = new SafariDriver(driver);
        pizzatempoPage = new PizzatempoPage(driver);
        pizzaTempoStep = new PizzaTempoStep(driver);
        driver.manage().window().maximize();
        pizzatempoPage.openBaseURL();
    }

    @Test
    public void testEmptyEmailAndPassword() {

       pizzaTempoStep.fillLoginFormWithInvalidEmailAndPassword("","");
    }

    @Test
    public void testWrongEmailAndAnyPassword() {

        pizzaTempoStep.fillLoginFormWithInvalidEmailAndPassword("email", Util.generatePassword());
    }
    @Test
    public void testEmptyEmailAndAnyPassword() {

        pizzaTempoStep.fillLoginFormWithInvalidEmailAndPassword("", Util.generatePassword());
    }
    @Test
    public void testCorrectEmailAndEmptyPassword() {

        pizzaTempoStep.fillLoginFormWithInvalidEmailAndPassword(Util.generateEmail(),"");
    }

    @Test
    public void testValidEmailAndPassword() {
       pizzaTempoStep.fillLoginFormWithValidEmailAndPassword(Util.generateEmail(),Util.generatePassword());
    }

    @AfterEach
    public void tearDown()  {
        driver.quit();
    }
}



