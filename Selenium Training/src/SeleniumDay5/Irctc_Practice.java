package SeleniumDay5;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc_Practice {

	public static void main(String[] args) {
		
		String driverPath = System.getProperty("user.dir")+ "\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver. manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
		driver.get("https://www.irctc.co.in/nget/train-search");

	}

}
