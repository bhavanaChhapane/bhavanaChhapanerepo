package SeleniumDay4;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args)  {
		
	String driverPath = System.getProperty("user.dir")+".\\executable\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
	String UserPassword = driver.findElement(By.tagName("span")).getText();
	UserPassword = UserPassword.replace("( Username :", "");
	UserPassword = UserPassword.replace("| Password ", "");
	UserPassword = UserPassword.replace(" )", "");
	String[] loginDetails = UserPassword.split("");
	System.out.println("User name and password is :"+UserPassword);
	driver.findElement(By.id("txtUsername")).sendKeys(loginDetails[0]);
	driver.findElement(By.id("txtPassword")).sendKeys(loginDetails[1]);
	driver.findElement(By.id("btnLogin")).click();
//	driver.navigate().back();
//	Thread.sleep(1000);
//	driver.findElement(By.linkText("Forgot your password?"));
//	driver.navigate().back();
//	Thread.sleep(1000);
//	driver.navigate().forward();
//	Thread.sleep(1000);
//	driver.navigate().refresh();
//	driver.close();
	}

}