package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class example2 {
	@Given("user Login")
	public void user_Login() {
	   System.out.println("user has logged in");
	}

	@When("user selects product using category")
	public void user_selects_product_using_category() {
		System.out.println("user has selected product");
	}

	@Then("verify the list of product And close application")
	public void verify_the_list_of_product_And_close_application() {
		System.out.println("user has selected and closed the application");
	}

	@When("user selects product using sub-category")
	public void user_selects_product_using_sub_category() {
		System.out.println("user has selected the product using sub-category");
	}

	@When("user selects product using product name")
	public void user_selects_product_using_product_name() {
		System.out.println("user has selected the product using product name");
	}


}
