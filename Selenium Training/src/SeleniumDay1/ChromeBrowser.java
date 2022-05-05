package SeleniumDay1;

//import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
	
		String path1 = "C:\\Users\\Dell\\eclipse-workspace\\Selenium Training\\executable\\chromedriver.exe";
		String path2 = ".\\executable\\chromedriver.exe";
		String path3 = System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		// set required browser  executable path using System.setProperty(String key, String value)
		//System.setProperty("webdriver.chrome.driver", path2);
		System.setProperty("webdriver.chrome.driver", path1);
		//System.setProperty("webdriver.chrome.driver", path3);
		ChromeDriver c1 = new ChromeDriver();
		
	}

}
