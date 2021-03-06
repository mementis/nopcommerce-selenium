package environment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnvironmentVariables {
	
	public static WebDriver driver;
	public static final String BASE_URL = "https://demo.nopcommerce.com/";
	public static final String REG_URL = "https://demo.nopcommerce.com/register?returnUrl=%2F";
	public static final String ACC_URL = "https://demo.nopcommerce.com/registerresult/1?returnUrl=/";
	public static final String LOGIN_URL = "https://demo.nopcommerce.com/login?returnUrl=%2F";
	
	
	public static int DRIVER_WAIT_SECONDS = 10;
	
	public static WebDriver setChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mena\\eclipse-workspace\\nopcommerce\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(BASE_URL);
		driver.manage().window().maximize();
		return driver;
	}
	
}
