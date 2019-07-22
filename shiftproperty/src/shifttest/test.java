package shifttest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import shiftproperty1.LoginDetail; 

public class test {
	
	 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/Users/priya/Downloads/geckodriver 3" ); 
		WebDriver driver = new FirefoxDriver();
		
		LoginDetail loginObject = new LoginDetail(driver);
		driver.get("https://www.findmyshift.com/au/");
		loginObject.loginclick();
		loginObject.loginelements("priyadharshinikp7@gmail.com", "password");
		
	}
	

}
