import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileDownload {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/download");

        driver.findElement(By.linkText("Jpeg_with_exif.jpeg")).click();
        driver.findElement(By.linkText("hello.txt")).click();
        driver.findElement(By.linkText("browser_fix_pack_upload.xlsx")).click();

        Thread.sleep(5000);   // Wait for download


        driver.quit();


    }
}
