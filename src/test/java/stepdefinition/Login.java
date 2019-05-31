package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class Login {
	WebDriver driver;
	public Login(WebDriver driver){
		PageFactory.initElements(driver,this);
		
		
	}
	@FindBy(xpath="//input[@name='userName']")
	public static WebElement un;
	@FindBy(xpath="//input[@name='password']")
	public static WebElement psd;
	@FindBy(xpath="//input[@name='Login']")
	public static WebElement ok;
	
	

}
