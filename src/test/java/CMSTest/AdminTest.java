package CMSTest;

import CMSPage.AdminPage;
import CMSPage.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AdminTest extends BaseTest {

    LoginPage loginPage;
    AdminPage adminPage;

    @Test
    public void verifyAdmin() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.name("username")));

        loginPage = new LoginPage(driver);

        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();

        adminPage = new AdminPage(driver);
        Thread.sleep(3000);
        adminPage.clickAdmin();
    }
}
