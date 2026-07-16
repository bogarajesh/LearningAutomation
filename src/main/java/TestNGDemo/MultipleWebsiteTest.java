package TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWebsiteTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void googleTest() {
        driver.get("https://www.google.com");
        System.out.println("Google Page Title: " + driver.getTitle());
    }

    @Test
    public void amazonTest() {
        driver.get("https://www.amazon.in");
        System.out.println("Amazon Page Title: " + driver.getTitle());
    }

    @Test
    public void flipkartTest() {
        driver.get("https://www.flipkart.com");
        System.out.println("Flipkart Page Title: " + driver.getTitle());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}