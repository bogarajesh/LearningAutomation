package TestNGDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class TestNGExample {
    WebDriver driver;

        @BeforeClass
        public void LaunchBrowser() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");
            System.out.println("Browser Opened");
            System.out.println(driver.getTitle());
        }

        @Test
        public void Login() {
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            System.out.println("Log in");
            System.out.println(driver.getTitle());
        }

        @Test(dependsOnMethods = "Login")
        public void LogOut() throws InterruptedException {
            //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            //wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn"))).click();
            driver.findElement(By.id("react-burger-menu-btn")).click();
            driver.findElement(By.id("logout_sidebar_link")).click();
            System.out.println("Log Out");
    }

        @AfterClass
        public void CloseBrowser() {
            driver.quit();
            System.out.println("Browser closed");
        }
    }
