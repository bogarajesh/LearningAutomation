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

        File destination = new File("Screenshots/LoginPage.png");

        FileHandler.copy(source, destination);

        System.out.println("SS Saved!");
        driver.quit();

    }
}
