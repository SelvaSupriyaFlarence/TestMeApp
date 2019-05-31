package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class example {
	WebDriver driver;
	@Given("user launch chrome browser And enter TestMeApp URL")
	public void user_launch_chrome_browser_And_enter_TestMeApp_URL() {
	    System.out.println("user has opened the TestMeApp");
	    System.setProperty("webdriver.chrome.driver", "");
	    driver=new ChromeDriver();
	    driver.get("http://www.newtours.demoaut.com/");
		
	   
	}
	@When("user enter username in username field")
	public void user_enter_username_in_username_field() {
	   System.out.println("user has entered username");
	}

	@When("user enter password in password field")
	public void user_enter_password_in_password_field() {
		System.out.println("user has entered password");
	}


	@When("user clicks on OK button")
	public void user_clicks_on_OK_button() {
	   System.out.println("user clicks OK button");
	}
	@Then("verify result")
	public void verify_result() {
	    System.out.println("user has entered verify result");
	}


}
