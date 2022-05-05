package SeleniumDay3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Assignment {

	private static WebElement all;

	public static void main(String[] args) {
	
		String driverPath = System.getProperty("user.dir")+ "\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().setSize(new Dimension(500,700));
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		System.out.println("PageTitle :"+ driver.getTitle());
		System.out.println("Current Page URL:"+ driver.getCurrentUrl());
		String expectedTitle = "amazon";
		String actualTitle = driver.getTitle();
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Browser Opened");
		}else {
			System.out.println("Browser Not Opened");
		}
		all = driver.findElement(By.className("All"));
		driver.click();
		
	}

}
