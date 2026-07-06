import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.navigate().to("https://www.saucedemo.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class= 'input_error form_input']")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

        String expectedTitle = "Swag Labs";
        String actualTitle =driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Pass");
        }
        else {
            System.out.println("fail");
        }

        String heading = driver.findElement(By.xpath("//span[text()='Products']")).getText();
        System.out.println("Heading: " + heading);

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();

    }
}
