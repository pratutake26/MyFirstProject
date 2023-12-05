import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable

           System.setProperty("webdriver.chrome.driver", "/Users/pratikshavilastake/Documents/CHdriver/chromedriver");

             WebDriver driver = new ChromeDriver();
             // Navigate to the desired URL
            driver.get("https://www.naukri.com/");

        }
}


