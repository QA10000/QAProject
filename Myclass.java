package NewPackage;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myclass{
	// TODO Auto-generated method stub
	

public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\kalra\\Downloads\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\kalra\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\kalra\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--remote-allow-origins=*");
		//opt.addArguments("--remote-allow-origins=*");
		
		//EdgeDriver driver = new EdgeDriver();
       
		
		
		
		// driver = new FirefoxDriver();
          WebDriver driver = new EdgeDriver();
 		// wait = new WebDriverWait(driver, Duration.ofSeconds(30));
 		 driver.get("https://www.yahoo.com");

		//WebDriverWait wait = new WebDriverWait(driver, 10); */

		}

}
