package CMSPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

        WebDriver driver;

        // Constructor
        public LoginPage(WebDriver driver) {
                this.driver = driver;
                PageFactory.initElements(driver, this);
        }


        // Locators
        @FindBy(xpath = "//input[@name= 'username']")
        WebElement username;

        @FindBy(name = "password")
        WebElement password;

        @FindBy(xpath = "//button[@type='submit']")
        WebElement loginButton;


        // Methods
        public void enterUsername(String user) {
                username.sendKeys(user);
        }

        public void enterPassword(String pass) {
                password.sendKeys(pass);
        }

        public void clickLogin() {
                loginButton.click();
        }
}