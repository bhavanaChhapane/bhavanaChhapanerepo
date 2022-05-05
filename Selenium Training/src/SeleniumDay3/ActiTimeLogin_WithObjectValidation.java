package SeleniumDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class ActiTimeLogin_WithObjectValidation {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		WebDriver driver = new ChromeDriver(); 
	  
		//maximize the Browser window
		driver.manage().window().maximize();
				//implicit wait 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement userNameInputField = driver.findElement(By.id("username"));
		System.out.println("User Nmae Input Field visbility status is :"+ userNameInputField.isDisplayed());
		System.out.println("UserName input field editable status is : "+ userNameInputField.isEnabled());
		userNameInputField.sendKeys("admin");
		
		WebElement passwordInputField = driver.findElement(By.name("pwd"));
		System.out.println("Password Input Field visibility status is :" + passwordInputField.isDisplayed());
		System.out.println("Password input field editable status is:" + passwordInputField.isEnabled());
		passwordInputField.sendKeys("manager");
		
		WebElement LoginButton = driver.findElement(By.name("loginButton"));
		System.out.println("Login Input Field :"+ LoginButton.isDisplayed());
		System.out.println("Login Input Field :"+ LoginButton.isEnabled());
		LoginButton.click();
}

}
