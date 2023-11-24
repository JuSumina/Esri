package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MapViewerPage extends CommonMethods {

    public MapViewerPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[@class='esri-widget--button esri-widget esri-interactive'][1]")
    public WebElement zoomInBtn;

    @FindBy(xpath="//div[@class='esri-widget--button esri-widget esri-interactive'][2]")
    public WebElement zoomOutBtn;

    @FindBy(id="calcite-action-7597fcf3-bbb2-2634-19ba-c18cc989ad85-button")
    public WebElement mapToolsBtn;

    @FindBy(xpath="//div[@title='Search']")
    public WebElement searchBtn;

    @FindBy(xpath="//form[@role='search']/input")
    public WebElement searchTextBox;

    @FindBy(xpath="//div[@class='esri-search-result-renderer__more-results-item'][1]")
    public WebElement searchResult;

    @FindBy(xpath="//ul[@class='esri-menu__list esri-search__suggestions-list']")
    public WebElement suggestedResults;


}
