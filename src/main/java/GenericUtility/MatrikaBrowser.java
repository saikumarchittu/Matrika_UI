 
package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MatrikaBrowser {

	public static WebDriver driver;
	
	@BeforeTest
	public static void setup() {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("http://stg-ecom.goldbox.gold/");
	}
	
}
