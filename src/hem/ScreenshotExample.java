package hem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class ScreenshotExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\softsuave\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.affitu.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            // Take screenshot as a File
            File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            // Save screenshot to the specified path
            FileHandler.copy(screenshotFile, new File("C:\\Users\\softsuave\\Pictures\\screenshot.png"));
            System.out.println("Screenshot taken successfully!");
        } catch (Exception e) {
            System.out.println("Failed to take screenshot!");
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}