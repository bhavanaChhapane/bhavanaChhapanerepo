package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AProgram {
	
public static void main(String [] args) {

String driverPath = System.getProperty("user.dir")+ "\\executable\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",driverPath);
WebDriver driver = new ChromeDriver();

driver.get("https://demo.actitime.com/login.do");

String expectedTitle="actiTime - Login";
String actualTitle = driver.getTitle();
if(actualTitle.equals(expectedTitle)){
System.out.println("Login page opened sucessfully...");
} 
else 
{
 System.out.println("Either login page not opened or page title got changed");
}


WebElement userNameInputField=driver.findElement(By.id("username"));
userNameInputField.sendKeys("admin234567");

userNameInputField.clear();
userNameInputField.sendKeys ("admin");

WebElement passwordInputField=driver.findElement(By.name("pwd"));
passwordInputField.sendKeys("manager");

WebElement loginButton = driver.findElement (By.id("loginButton"));
loginButton.click();

driver.close();
}
}