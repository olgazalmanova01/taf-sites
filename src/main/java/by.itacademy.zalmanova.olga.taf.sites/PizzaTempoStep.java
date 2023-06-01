package by.itacademy.zalmanova.olga.taf.sites;
import org.openqa.selenium.safari.SafariDriver;

public class PizzaTempoStep {
    PizzatempoPage page;
    SafariDriver driver;

    public PizzaTempoStep(SafariDriver driver) {
        page = new PizzatempoPage(driver);
    }
        public void fillLoginForm (String email, String password){
            page.sendKeysInputEmail(email);
            page.sendKeysInputPassword(driver, password);
            page.clickSubmitButton(driver);
        }
    }



