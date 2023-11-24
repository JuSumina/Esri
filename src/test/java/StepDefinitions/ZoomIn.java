package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ZoomIn extends CommonMethods {

    @When("user logs into ArcGIS Map Viewer application")
    public void user_logs_into_arc_gis_map_viewer_application() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement signInButtonMain = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='esri-header-client']/div/button")));
        signInButtonMain.click();

        sendText(login.usernameTextBox, ConfigReader.getPropertyValue("username"));
        sendText(login.passwordTextBox, ConfigReader.getPropertyValue("password"));
        login.signInBtn.click();

    }
    @When("user clicks on Zoom in button")
    public void user_clicks_on_zoom_in_button() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement zoomInButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='esri-widget--button esri-widget esri-interactive'][1]")));
        zoomInButton.click();
        //doClick(mapViewer.zoomInBtn);

    }
    @Then("user is Zoomed in")
    public void user_is_zoomed_in() {

    }
}
