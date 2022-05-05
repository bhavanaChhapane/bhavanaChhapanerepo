package SeleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		//String A = ".\\executable\\chromedriver.exe";
		//System.setProperty("user.dir")+ ;
		System.setProperty ("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get ("https://www.google.com/");
		
		  
		System.out.println("Application source code :" + sourceCode);
		System.out.println("Source Code Length :"+ sourceCode.length());
		System.out.println("Application Current URL:"+ driver.getCurrentUrl());
		System.out.println("Application Current Title :"+ driver.getTitle());
		
		if(driver.getTitle().equals("Google")) {
			System.out.println("Google search page opnened successfully");
		}else {
			System.out.println("Either google search page not opned or its title got chnaged");
		}
	}

}
 