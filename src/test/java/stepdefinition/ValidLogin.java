package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import environment.EnvironmentVariables;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagemethods.HomePageMethods;
import pagemethods.ValidLoginMethods;

public class ValidLogin extends EnvironmentVariables{
	WebDriver driver = setChromeDriver();
	
	@Given("User has navigated to login page")
	public void user_has_navigated_to_login_page() throws InterruptedException {
		HomePageMethods homePage = new HomePageMethods(driver);
		homePage.navigateToLogIn();
		Assert.assertEquals(driver.getCurrentUrl(), LOGIN_URL);
			    
	}

	@When("User enters valid email and password")
	public void user_enters_valid_email_and_password() throws InterruptedException {
		ValidLoginMethods enterCredentials = new ValidLoginMethods(driver);
		enterCredentials.populateValidEmail();
		enterCredentials.populateValidPassword();
		
		
	    
	}

	@When("User submits the entry")
	public void user_submits_the_entry() throws InterruptedException {
		ValidLoginMethods submitCredentials = new ValidLoginMethods(driver);
		submitCredentials.submitLogin();
	    
	}

	@Then("User should successfully login to account")
	public void user_should_successfully_login_to_account() throws InterruptedException {
		ValidLoginMethods accountLogin = new ValidLoginMethods(driver);
		String returnMessage = accountLogin.myAccountBreadcrumb();
		System.out.println(returnMessage);
		Assert.assertNotNull(returnMessage);
	    
	}

}
