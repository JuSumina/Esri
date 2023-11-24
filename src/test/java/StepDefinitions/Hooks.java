package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebElement;

public class Hooks extends CommonMethods {

    @Before
    public void preCondition () {

        openBrowserAndLaunchApplication();

    }

    /*@After
    public void postCondition () {

        closeBrowser();

    }*/
}
