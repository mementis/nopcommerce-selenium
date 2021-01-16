package pagemethods;

import org.openqa.selenium.WebDriver;

import pageobjects.RegisterAccountObjects;

public class RegisterAccountMethods extends RegisterAccountObjects {
	
	WebDriver driver;
	
	public RegisterAccountMethods(WebDriver driver) {
		this.driver = driver;
	}
	
	public void populateFirstName() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(firstName).sendKeys(firstNameValue);
	}
	
	public void populateLastName() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(lastName).sendKeys(lastNameValue);
	}
	
	public void populateEmail() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(email).sendKeys(emailValue);
	}
	
	public void populatePassword() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(password).sendKeys(passwordValue);
	}
	
	public void populateConfirmPassword() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(confirmPassword).sendKeys(passwordValue);
	}
	
	public void clickRegisterButton() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(registerButton).click();
	}
	
	public String logRegistrationMessage() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(registrationMessage).getText();
	}

}
