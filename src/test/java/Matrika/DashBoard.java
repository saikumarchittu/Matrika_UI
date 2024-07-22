
package Matrika;

import org.testng.annotations.Test;
import GenericUtility.MatrikaBrowser;
import ObjectRerpository.Matrika_HomePage;

public class DashBoard extends MatrikaBrowser{

	Matrika_HomePage mh;
	
	@Test	
	public void dashBoardElements() throws Exception {
		mh=new Matrika_HomePage(driver);
		
		mh.HomePageElements(driver);
		Thread.sleep(3000);
		
		driver.close();
	}
}