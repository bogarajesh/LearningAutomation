package ActionsDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
public class ClickEvents {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/buttons");

        Actions actions = new Actions (driver);

        WebElement rightclickbtn =driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightclickbtn).perform();
        WebElement message = driver.findElement(By.id("rightClickMessage"));
        System.out.println("message:" + message.getText());


        WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(doubleclick).perform();
        WebElement message1 = driver.findElement(By.id("doubleClickMessage"));
        System.out.println("message1:" + message1.getText());

        Thread.sleep(2000);

        driver.quit();


    }
}
