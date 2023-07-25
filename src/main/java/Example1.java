import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shaji\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        if(pageTitle.contains("Automation Solution"))
            System.out.println("Passed!");
        else
            System.out.println("Failed");

        driver.quit();
    }
}
