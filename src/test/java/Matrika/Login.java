package Matrika;

import org.testng.annotations.Test;
import GenericUtility.MatrikaBrowser;
import GenericUtility.Matrika_SignUp_Page_LogIn;

public class Login extends MatrikaBrowser{
        
	Matrika_SignUp_Page_LogIn mspl;
	
	@Test
	public void LoginOperation() throws Exception {
		mspl=new Matrika_SignUp_Page_LogIn(driver);
		
		mspl.SignUpAndLogin(driver);
		Thread.sleep(3000);
		
		driver.close();
	}
}
