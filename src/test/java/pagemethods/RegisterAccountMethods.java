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

}
