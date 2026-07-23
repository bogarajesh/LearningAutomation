package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProviderDemo {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");
    }

    @Test(dataProvider = "logindata")
    public void LoginTest(String Username, String Password){

        driver.findElement(By.id("user-name")).sendKeys(Username);
        driver.findElement(By.id("password")).sendKeys(Password);

        driver.findElement(By.id("login-button")).click();

        System.out.println("Login Attempt Successfully : " + Username);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }

    @DataProvider(name="logindata")
    public Object[][] getData() {

        return new Object[][]{

                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user","secret_sauce"}

        };
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}