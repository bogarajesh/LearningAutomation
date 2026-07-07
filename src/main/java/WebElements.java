import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://the-internet.herokuapp.com/checkboxes");
        Thread.sleep(4000);
    WebElement cb2 = driver.findElement(By.xpath("//input[@type='checkbox']"));
        if (!cb2.isSelected()){
        cb2.click();
    }
        System.out.println(cb2.isSelected());



        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
        Thread.sleep(2000);
    WebElement dropdownElements = driver.findElement(By.id("dropdown"));
    Select dropdown = new Select(dropdownElements);
        dropdown.selectByVisibleText("Option 1");
        Thread.sleep(2000);
        System.out.println(dropdown.getFirstSelectedOption().getText());


        driver.navigate().to("https://demoqa.com/radio-button");
        Thread.sleep(2000);
    WebElement radiobutton = driver.findElement(By.id("impressiveRadio"));


        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
    Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(2000);

        driver.quit();
}
}
