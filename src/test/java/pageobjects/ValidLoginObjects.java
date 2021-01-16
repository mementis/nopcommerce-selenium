package pageobjects;

import org.openqa.selenium.By;

public class ValidLoginObjects {
	
	public static By validEmail = By.id("Email");
	public static String validEmailValue = "marapopara@mail.com";
	public static By validPassword = By.id("Password");
	public static String validPasswordValue = "kokoska";
	public static By loginButton = By.xpath("//input[@class=\"button-1 login-button\" and @type=\"submit\"]");
	
	public static By myAccountBreadcrumb = By.xpath("//a[@href=\"/customer/info\" and @class=\"ico-account\"]");

}
