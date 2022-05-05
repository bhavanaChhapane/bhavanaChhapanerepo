package SeleniumDay3;

//import java.awt.List;
import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import day3.By;

public class Random {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir")+ "\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");
		List<WebElement> allOptions=driver.findElements((org.openqa.selenium.By) By.cssSelecto("#nav-xshop>a"));
		System.out.println("Total identified Elements: "+allOptions.size());
		for(int i=0;i<allOptions.size();i++) {

		WebElement option=allOptions.get(i);
		String name=option.getText();
		System.out.println("Option Name: "+name);
		if(name.equals("Amazon Pay")) {
		 option.click();
		break;
		}else {
		         System.out.println("Not matched..........");
		}
		}
		driver.navigate().back();
		}
		}