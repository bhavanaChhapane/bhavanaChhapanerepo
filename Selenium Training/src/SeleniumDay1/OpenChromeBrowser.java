package SeleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		
		String Bhavi = "C:\\Users\\Dell\\eclipse-workspace\\Selenium Training\\executable\\chromedriver.exe";
		String Bhav = ".\\executable\\chromedriver.exe";
		String Bhavna = System.getProperty("user.dir") + "\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Bhavna);
		ChromeDriver cdriver = new ChromeDriver();
		System.out.println("Chrome Browser is open" + cdriver);

	}

}
