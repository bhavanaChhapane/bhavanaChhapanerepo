package SeleniumDay3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxMinFunction {

	public static void main(String[] args) {
	
		String driverPath = System.getProperty("user.dir") + "\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("www.facebook.com");
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("Get the page Title :" + driver.getTitle());
		System.out.println("Current Page URL :"+ driver.getCurrentUrl());
		System.out.println("Hello");
		
		driver.findElement(By.linkText("Forget Your Password?")).click();
	}

}
