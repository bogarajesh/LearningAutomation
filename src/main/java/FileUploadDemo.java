import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUploadDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/upload");

        String filePath = "C:\\Users\\dell\\Downloads\\sampleFile.jpeg";

        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(filePath);
        driver.findElement(By.xpath("//input[@type= 'submit']")).click();

        String message = driver.findElement(By.tagName("h3")).getText();
        System.out.println(message);

        driver.quit();

    }
}
