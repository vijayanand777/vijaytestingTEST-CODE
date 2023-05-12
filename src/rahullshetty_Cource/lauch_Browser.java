package rahullshetty_Cource;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lauch_Browser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\softsuave\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   System.out.println(driver.getTitle());
	   Thread.sleep(10000);
	   driver.quit();
	}

}
