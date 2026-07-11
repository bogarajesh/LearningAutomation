import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutorDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/text-box");
        Thread.sleep(2000); // For demo only

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to bottom
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        Thread.sleep(2000); // For demo only

        // Scroll to top
        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(2000); // For demo only

        // down
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000); // For demo only

        //up
        js.executeScript("window.scrollBy(0,-500)");
        Thread.sleep(2000); // For demo only

        driver.findElement(By.id("userName")).sendKeys("First Automation");

        //find the submit bottom
        WebElement submitBtn = driver.findElement(By.id("submit"));
        js.executeScript("arguments[0].scrollIntoView(true);", submitBtn);
        js.executeScript("arguments[0].click();", submitBtn);

        WebElement output = driver.findElement(By.id("output"));
        Thread.sleep(2000);

        System.out.println(output.getText());

        driver.quit();
    }
}