package SeleniumDay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01 {

	public static void main(String[] args) throws InterruptedException {
		
		String driverPath = System.getProperty("user.dir")+ "\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("www.amazon.in");
		
		//String sourceCode=driver.getPageSource();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//implicit wait 
		driver.manage().window();

	}

}
