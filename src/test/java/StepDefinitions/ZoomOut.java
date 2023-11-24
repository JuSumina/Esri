package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ZoomOut extends CommonMethods {


    @When("user clicks on Zoom out button")
    public void user_clicks_on_zoom_out_button() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement zoomOutButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='esri-widget--button esri-widget esri-interactive'][2]")));
        zoomOutButton.click();
        //doClick(mapViewer.zoomOutBtn);
    }

    @Then("user is Zoomed out")
    public void user_is_zoomed_out() {

    }

}
