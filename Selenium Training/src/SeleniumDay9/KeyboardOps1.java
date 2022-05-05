package SeleniumDay9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOps1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver =s1.setup("chrome","https://www.flipcart.com/");
		//driver.get("https://www.flipcart.com");
		//using escape of keyboard to avoid login popup
		//driver.findElement(By.id("container")).sendKeys(Keys.ESCAPE);
		}

}
