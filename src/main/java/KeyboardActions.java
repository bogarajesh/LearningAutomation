import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardActions {
        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://demoqa.com/text-box");

            Actions actions = new Actions(driver);

            driver.findElement(By.id("userName")).sendKeys("First Automation");
            driver.findElement(By.id("userEmail")).sendKeys("firsrautomation@gmail.com");
            driver.findElement(By.id("currentAddress")).sendKeys("Mumbai");

            // Select All
            actions.keyDown(Keys.CONTROL)
                    .sendKeys("a")
                    .keyUp(Keys.CONTROL)
                    .perform();

            // Copy
            actions.keyDown(Keys.CONTROL)
                    .sendKeys("c")
                    .keyUp(Keys.CONTROL)
                    .perform();

            // TAB
            actions.sendKeys(Keys.TAB).perform();

            // Paste
            actions.keyDown(Keys.CONTROL)
                    .sendKeys("v")
                    .keyUp(Keys.CONTROL)
                    .perform();

            WebElement submitBtn = driver.findElement(By.id("submit"));
            submitBtn.click();


            WebElement output = driver.findElement(By.xpath("//button[text()='Submit']"));
            System.out.println(output.getText());

            Thread.sleep(3000);

            driver.quit();
        }
    }
