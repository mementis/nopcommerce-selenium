package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import environment.EnvironmentVariables;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagemethods.HomePageMethods;
import pagemethods.RegisterAccountMethods;

public class RegisterAccount extends EnvironmentVariables {
	WebDriver driver = setChromeDriver();
	
	@Given("User lands on account registration page")
	public void user_lands_on_account_registration_page() throws InterruptedException {
		HomePageMethods homePage = new HomePageMethods(driver);
		homePage.navigateToRegister();
		Assert.assertEquals(driver.getCurrentUrl(),REG_URL);
	}

	@When("User fill in form with valid credentials")
	public void user_fill_in_form_with_valid_credentials() throws InterruptedException {
		RegisterAccountMethods populateForm = new RegisterAccountMethods(driver);
		populateForm.populateFirstName();
		populateForm.populateLastName();
		populateForm.populateEmail();
		populateForm.populatePassword();
		populateForm.populateConfirmPassword();
		
	    
	    
	}

	@When("User clicks register")
	public void user_clicks_register() throws InterruptedException {
		RegisterAccountMethods registerAccount = new RegisterAccountMethods(driver);
		registerAccount.clickRegisterButton();
	   
	}

	@Then("User gets logged in to user's account")
	public void user_gets_logged_in_to_user_s_account() {
	    
	   
	}

}
