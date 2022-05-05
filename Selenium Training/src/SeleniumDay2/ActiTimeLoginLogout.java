package SeleniumDay2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginLogout {

	public static void main(String[] args) {
		
		String driverPath = System.getProperty("user.dir") + "\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedTitle = "actiTIME - Login";
		String actualTitle = driver.getTitle();
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("chrome browser opened successsufully");
		}else {
			System.out.println("Not opened or title got changed");
		}
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.linkText("logout")).click();
		driver.findElement(By.id("logoutLink")).click();
		
	}  

}
