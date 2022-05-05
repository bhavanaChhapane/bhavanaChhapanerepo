package SeleniumDay1;

public class GenericWayToOpenAnyBrowser {

	public static void main(String[] args) {
		
		String geckoDriverPath = System.getProperty("user,dir")+"\\executable\\geckodriver.exe";
		String chromeDriverPath = System.getProperty("user,dir")+"\\executable\\chromedriver.exe";
		openBrowser(geckoDriverPath, "firefox");
		openBrowser(chromeDriverPath, "Chrome");
		
		
	}

	 static void openBrowser(String geckoDriverPath, String firefox) {
		// TODO Auto-generated method stub
		if (firefox .equalsIgnoreCase("chrome"));  
	}

}
 