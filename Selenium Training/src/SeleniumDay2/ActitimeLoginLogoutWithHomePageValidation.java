package SeleniumDay2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginLogoutWithHomePageValidation {

	public static void main(String[] args) {
		
		String driverPath = System.getProperty("user.dir")+ "\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		 String expectedTitle="actiTIME - Login";
		 String actualTitle= driver.getTitle();
		 if (actualTitle.equals(expectedTitle)) {
		 	System.out.println("Login Page Opened Succedssfully");
		 }else {
			 System.out.println("Either login page not opened or Page title got change");
		 }
		 
		 driver.findElement(By.name("username")).sendKeys("admin");
		 
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 
		 driver.findElement(By.id("loginButton")).click();
		 
		 //driver.findElement(By.name("logoutButton")).click();
		 WebElement logoutButton = driver.findElement(By.id("logoutLink"));
		 WebDriverWait wait = new WebDriverWait(driver,20);
		 wait.until(ExpectedCondition.elementToBeClickable(logoutButton));
		 String actualHomePageTitle = "actiTIME - Enter Time-Track";
		 if (actualHomePageTitle.equals(expectedHomePageTitle)) {
		  System.out.println("Succesfully Login");
		 }else{
			 System.out.println("Succesfully not login Or Title got changed");
		 }
		 
		 driver.findElement(By.linkText("Logout")).click();
	}

}
