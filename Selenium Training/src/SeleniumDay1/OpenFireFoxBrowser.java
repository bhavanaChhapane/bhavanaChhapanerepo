package SeleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFoxBrowser {
	
	public static void main(String args[]) {
	String Ank1 = "C:\\Users\\Dell\\eclipse-workspace\\Selenium Training\\executable\\geckodriver.exe";
	String Ank2 = ".\\executable\\geckodriver.exe";
	String Ank3 = System.getProperty("user.dir")+ "\\executable\\geckodriver.exe";
	
	System.setProperty("webdriver.gecko.driver",Ank3 );
	WebDriver wdriver = new FirefoxDriver();
		System.out.println("Done"+ wdriver);
}
}