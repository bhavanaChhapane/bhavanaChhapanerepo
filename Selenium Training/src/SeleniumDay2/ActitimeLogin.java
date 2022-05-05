package SeleniumDay2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeLogin {

	public static void main(String[] args) {
		
		String driverPath = System.getProperty("user.dir")+ "\\executable\\chromedriver.exe";
		System.setProperty ("webdriver.chrome.driver" , driverPath);
		WebDriver driver = new ChromeDriver();
		//maximize the browser window
		//driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		String expectedTitle="actiTIME - Login" ;
		String actualTitle= driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
		System.out.println("Login page opened successfully ");
	}else {
		System.out.println("Either Login Page not opened or page Title got Changed ");
	}
		WebElement userNameInputField = driver. findElement(By.id("username"));
		userNameInputField.sendKeys("admin234567");
		userNameInputField.clear();  
		userNameInputField.sendKeys("admin");
		
		
		WebElement passwordInputField = driver.findElement(By.name("pwd"));
		passwordInputField.sendKeys("manager");
//		System.out.println("Password Input Field visibility status is :" + passwordInputField.isEnabled());
//		System.out.println("Password Input Field editability status is :" + passwordInputField.isSelected());
//		System.out.println("Password Input Field Input "+ passwordInputField.isDisplayed());  
		
		WebElement checkbox = driver.findElement(By.name("remember"));
		checkbox.click();
		
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		
}
}
