package SeleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get ("https://demo.actitime.com/");
		String sourceCode=driver.getPageSource();
		System.out.println(" Application source code: " +sourceCode);
		System.out.println("Source Code Length: "+ sourceCode.length());
		System.out.println("Application current URL" +driver. getCurrentUrl());
		System.out.println("Application current title:" +driver.getTitle());
		
		if (driver.getTitle() != null) {
			System.out.println("Google Search Page Opened Succesfully");
		}else {
			System.out.println("Either google search page not opened or its title got changed");
		}
		//driver.close();

	}

}
