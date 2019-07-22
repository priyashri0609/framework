package shiftproperty1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.FindBy;


public class LoginDetail {
	WebDriver driver;
	By user99GuruName = By.xpath("//*[@id=\"ctl00_menu_mnuLogInOut\"]/a");
	By uname=By.id("ctl00_body_txtUsername");
	By pass=By.id("ctl00_body_txtPassword");
	By click=By.id("ctl00_body_lnkLogin");
	 
	public LoginDetail(WebDriver driver)
	{
		System.setProperty("webdriver.gecko.driver","/Users/priya/Downloads/geckodriver 3" ); 
	this.driver=driver;
	}
	//hi
	public void loginclick()
	{
		driver.findElement(user99GuruName).click();
	}
	public void loginelements(String username, String password)
	{
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		driver.findElement(uname).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(click).click();
		
	}
	
}
