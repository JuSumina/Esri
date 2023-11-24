package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="user_username")
    public WebElement usernameTextBox;

    @FindBy(id="user_password")
    public WebElement passwordTextBox;

    @FindBy(xpath="//div[@class='esri-header-client']/div/button")
    public WebElement signInBtnMain;

    @FindBy(id="signIn")
    public WebElement signInBtn;

}
