package TestNGDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class HardAssertion {

        WebDriver driver;

        @BeforeMethod
        public void setup() {

            driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.saucedemo.com");
        }

        @Test
        public void verifyTitle() {

            String expected = "Swag Labs";
            //String expected = "Swag labs";
            String actual = driver.getTitle();

            Assert.assertEquals(actual, expected);

            System.out.println(driver.getTitle());
            System.out.println("Title Verified Successfully");

            driver.findElement(By.id("login-button")).click();

        }

        @AfterMethod
        public void tearDown() {

            driver.quit();
        }
    }
