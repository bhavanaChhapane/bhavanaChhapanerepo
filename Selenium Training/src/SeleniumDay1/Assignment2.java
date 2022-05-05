package SeleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
		
		driver.get ("https://www.facebook.com");
		System.out.println("Application current title:" +driver.getTitle());
	}
	
} 
