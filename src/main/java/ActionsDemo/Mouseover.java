package ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Mouseover {

        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://demoqa.com/menu");

            Actions actions = new Actions(driver);
            WebElement mainItem2 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));

            actions.moveToElement(mainItem2).perform();
            Thread.sleep(3000);

            System.out.println("Mouse Hover Performed Successfully");

            driver.quit();
        }
    }

