package pagemethods;

import org.openqa.selenium.WebDriver;

import pageobjects.HomePageObjects;

public class HomePageMethods extends HomePageObjects{
	
	WebDriver driver;
	
	public HomePageMethods(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToRegister() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(navigateToRegister).click();

	}
	
	public void navigateToLogIn() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(navigateToLogIn).click();
	}
	
	public void navigateToWishlist() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(navigateToWishlist).click();
	}
	
	public void navigateToShoppingCart() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(navigateToShoppingCart).click();
	}

}
