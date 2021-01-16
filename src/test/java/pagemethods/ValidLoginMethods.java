package pagemethods;

import org.openqa.selenium.WebDriver;

import pageobjects.ValidLoginObjects;

public class ValidLoginMethods extends ValidLoginObjects{
	
	WebDriver driver;
	
	public ValidLoginMethods(WebDriver driver) {
		this.driver = driver;
	}
	
	public void populateValidEmail() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(validEmail).sendKeys(validEmailValue);
	}
	
	public void populateValidPassword() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(validPassword).sendKeys(validPasswordValue);
	}
	
	public void submitLogin() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(loginButton).click();
	}
	
	public String myAccountBreadcrumb() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(myAccountBreadcrumb).getText();
	}

}
