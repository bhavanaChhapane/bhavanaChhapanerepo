package SeleniumDay3;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAction {

			private static final String[] Input = null;

			public static void main(String[] args) throws InterruptedException{
				String Path = System.getProperty("user.dir") + "\\executable\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", Path);
				//creating an object of chromedriver class and upcasting it to WebDriver interface
				WebDriver driver=new ChromeDriver();
				//enter required application url
				driver.get("https://demosite.executeautomation.com/Login.html");
				//implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				/* driver can wait for the element from 0-30 sec*/
				WebElement userNameInputField=driver.findElement(By.name("UserName"));
				//perform typing operation
				userNameInputField.sendKeys("execution");
				//identify password field
				WebElement PasswordInputField = driver.findElement(By.name("Password"));
				PasswordInputField.sendKeys("admin");
				
				WebElement LoginInputField = driver.findElement(By.cssSelector("Input[value='Login']"));
				LoginInputField.click();
				
				//explicit wait
				Thread.sleep(10000);
				//logout link
				WebElement logoutLink=driver.findElement(By.cssSelector("a[href='Login.html']"));
				logoutLink.click();
				userNameInputField.clear();
				PasswordInputField.clear();
				//close current browser
				//driver.close();		
			}
		}