package TestNGDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

        @Test
        public void verifyTitle() {

            WebDriver driver = new ChromeDriver();

            driver.get("https://www.saucedemo.com");

            SoftAssert soft = new SoftAssert();

            soft.assertEquals(driver.getTitle(), "Swag Labs");
            //soft.assertEquals(driver.getTitle(), "Swag Lab");

            System.out.println("Program Continues");

            driver.findElement(By.id("login-button")).click();

            soft.assertAll();

            driver.quit();

        }
}
