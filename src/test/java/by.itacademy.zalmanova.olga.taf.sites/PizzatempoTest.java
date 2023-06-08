package by.itacademy.zalmanova.olga.taf.sites;


import by.itacademy.zalmanova.olga.taf.sites.pages.PizzatempoPage;
import by.itacademy.zalmanova.olga.taf.sites.steps.PizzaTempoStep;
import by.itacademy.zalmanova.olga.taf.sites.utils.Util;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.safari.SafariDriver;

public class PizzatempoTest {
    private SafariDriver driver;
    PizzatempoPage pizzatempoPage;
    PizzaTempoStep pizzaTempoStep;
    Util util;
    Faker faker;

    @BeforeEach
    public void warmUp() {
        driver = new SafariDriver();
        pizzatempoPage = new PizzatempoPage(driver);
        pizzaTempoStep = new PizzaTempoStep(driver);
        driver.manage().window().maximize();
        pizzatempoPage.openBaseURL();
        faker = new Faker();
        util = new Util();

    }

    @Test
    public void testEmptyEmailAndPassword() {

       pizzaTempoStep.fillLoginFormWithInvalidEmailAndPassword("","");
    }

    @Test
    public void testWrongEmailAndAnyPassword() {

        pizzaTempoStep.fillLoginFormWithInvalidEmailAndPassword("email", util.generatePassword());
    }
    @Test
    public void testEmptyEmailAndAnyPassword() {

        pizzaTempoStep.fillLoginFormWithInvalidEmailAndPassword("", util.generatePassword());
    }
    @Test
    public void testCorrectEmailAndEmptyPassword() {

        pizzaTempoStep.fillLoginFormWithInvalidEmailAndPassword(util.generateEmail(),"");
    }

    @Test
    public void testValidEmailAndPassword() {
       pizzaTempoStep.fillLoginFormWithValidEmailAndPassword(util.generateEmail(),util.generatePassword());
    }

    @AfterEach
    public void tearDown()  {
        driver.quit();
    }
}



