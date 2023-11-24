package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MeasureTool extends CommonMethods {

    @When("user clicks on Map tools button")
    public void user_clicks_on_map_tools_button() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement mapToolsButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@arial-label='Map tools']")));
        mapToolsButton.click();

    }
    @When("user clicks on Measurement button")
    public void user_clicks_on_measurement_button() {

    }
    @When("user clicks on the map to place their first point")
    public void user_clicks_on_the_map_to_place_their_first_point() {

    }
    @When("user clicks on the map to place their destination point")
    public void user_clicks_on_the_map_to_place_their_destination_point() {

    }
    @When("user clicks Enter key on the keyboard")
    public void user_clicks_enter_key_on_the_keyboard() {

    }
    @Then("user can see the total distance between the first and the destination point")
    public void user_can_see_the_total_distance_between_the_first_and_the_destination_point() {

    }
}
