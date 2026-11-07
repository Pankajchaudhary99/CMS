package CMSTest;

import CMSPage.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    LoginPage loginPage;

    @Test
    public void verifyLogin() throws InterruptedException {

        Thread.sleep(3000);

        loginPage = new LoginPage(driver);

        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();

        //Assert.assertTrue(driver.getCurrentUrl().contains("/dashboard/index"), "Login Passed!");

    }
}


