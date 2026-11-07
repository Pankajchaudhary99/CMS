package CMSTest;

import CMSPage.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        loginPage = new LoginPage(driver);
    }

    @Test
    public void verifyLogin() throws InterruptedException {

        Thread.sleep(3000);
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin12");
        loginPage.clickLogin();
    }
}

        /*Assert.assertTrue(
                driver.getCurrentUrl().contains("/dashboard/index"), "Login Passed!");
        }
*/
/*
    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
*/

