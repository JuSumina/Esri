package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import Utils.Constants;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchTool extends CommonMethods {

    @When("user clicks on Search button")
    public void user_clicks_on_search_button() {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@title='Search']")));
        searchButton.click();
        //doClick(mapViewer.searchBtn);

    }
    @When("user enters the name of the place they are searching for")
    public void user_enters_the_name_of_the_place_they_are_searching_for() {

        sendText(mapViewer.searchTextBox, ConfigReader.getPropertyValue("place"));

    }
    @When("user clicks on the name of the place they are searching for")
    public void user_clicks_on_the_name_of_the_place_they_are_searching_for() {

        List<WebElement> places = mapViewer.suggestedResults.findElements(By.tagName("li"));
        for (int i = 0; i < places.size(); i++)
        {
            if(places.get(i).getText().contains(ConfigReader.getPropertyValue("place"))) {
                places.get(i).click();
            }
        }

    }
    @Then("user can see their Search result")
    public void user_can_see_their_search_result() {

        String actualResult = mapViewer.searchResult.getText();
        String expectedResult = ConfigReader.getPropertyValue("place");
        Assert.assertTrue(actualResult.contains(expectedResult));

    }
}
