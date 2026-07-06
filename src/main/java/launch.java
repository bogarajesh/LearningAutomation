import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        System.out.println(driver.getTitle());

        driver.navigate().to("https://www.saucedemo.com");

        Thread.sleep(2000);

        driver.navigate().to("https://www.OrangeHRM.com");

        driver.navigate().back();

        Thread.sleep(2000);

        driver.navigate().forward();

        Thread.sleep(2000);

        driver.navigate().refresh();

        Thread.sleep(2000);

        driver.manage().window().maximize();

        Thread.sleep(2000);

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        driver.quit();

    }
}
