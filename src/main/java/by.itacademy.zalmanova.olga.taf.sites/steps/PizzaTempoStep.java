package by.itacademy.zalmanova.olga.taf.sites.steps;
import by.itacademy.zalmanova.olga.taf.sites.pages.PizzatempoPage;
import org.openqa.selenium.safari.SafariDriver;

public class PizzaTempoStep {
    PizzatempoPage page;
    private SafariDriver driver;

    public PizzaTempoStep(SafariDriver driver) {
        driver = newDriver;
        page = new PizzatempoPage(driver);
    }
        public void fillLoginFormWithInvalidEmailAndPassword (String email, String password){

            page.openBaseURL();
            page.sendKeysInputEmail(email);
            page.sendKeysInputPassword(password);
            page.clickSubmitButton();
            page.getAllert();
        }
        public void fillLoginFormWithValidEmailAndPassword(String email, String password){

        page.openBaseURL();
        page.sendKeysInputEmail(email);
        page.sendKeysInputPassword(password);
        page.clickSubmitButton();
        page.getError();
        }
    }



