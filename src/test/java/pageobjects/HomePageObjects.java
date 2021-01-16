package pageobjects;

import org.openqa.selenium.By;

public class HomePageObjects {
	
	public static By navigateToRegister = By.xpath("//a[@href=\"/register?returnUrl=%2F\" and @class=\"ico-register\"]");
	public static By navigateToLogIn = By.xpath("//a[@href=\"/login?returnUrl=%2F\" and @class=\"ico-login\"]");
	public static By navigateToWishlist = By.xpath("//a[@href=\"/wishlist\" and @class=\"ico-wishlist\"]");
	public static By navigateToShoppingCart = By.xpath("//a[@href=\"/cart\" and @class=\"ico-cart\"]");
	

}
