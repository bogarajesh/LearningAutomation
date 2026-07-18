import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ScreenShotDemo {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com");

        File folder = new File("Screenshots");
        if (!folder.exists()) {
            folder.mkdir();
        }

        TakesScreenshot SS = (TakesScreenshot) driver;
        File source = SS.getScreenshotAs(OutputType.FILE);
        File destination = new File("Screenshots/Home Page.png");
        FileHandler.copy(source, destination);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        TakesScreenshot SS1 = (TakesScreenshot) driver;
        source = SS.getScreenshotAs(OutputType.FILE);
        destination = new File("Screenshots/Logged In.png");
        FileHandler.copy(source, destination);

        System.out.println("SS Saved!");
        driver.quit();
    }
}
