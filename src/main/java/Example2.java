import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shaji\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.get("https://wikipedia.org");
        WebElement searchBox = driver.findElement(By.id("searchInput"));
        searchBox.sendKeys("Selenium");
    }
}
