package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Matrika_SignUp_Page_LogIn {

	
	//Account Profile
	
	@FindBy (xpath = "//p[.='Account']") private WebElement AccountIcon;
	@FindBy(xpath = "//h3[.='Your Account']")private WebElement YourAccount;
	@FindBy(xpath = "//button[.='Log In']")private WebElement LogInBtn;
	@FindBy(xpath = "//button[.='Sign Up']")private WebElement SignUpBtn;
	
	//SignUp page
	
	@FindBy(xpath = "//p[.='Sign Up']")private WebElement SignUpPage;
	@FindBy(xpath = "(//input[@placeholder='Enter Full Name'])[2]") private WebElement EnterFullNameEdt;
	@FindBy(xpath = "(//input[@placeholder='Enter Mail Id'])[2]") private WebElement MailIdEdt;
	@FindBy(xpath = "(//input[@placeholder='Enter Mobile Number'])[2]")private WebElement MobileNumberEdt;
	@FindBy(xpath = "//input[@placeholder='Enter Referral Code']")private WebElement ReferalCodeEdt;
	@FindBy(xpath = "//input[@formcontrolname='termsAndConditions']")private WebElement CheckBox;
	@FindBy(xpath = "//button[.='Create Account']")private WebElement CreateAccountBtn;
	@FindBy(xpath = "//span[@class='span-sign-up-para']")private WebElement LogInOpt;
	
	//Login Page
	
	@FindBy(xpath = "//p[.='Log In']")private WebElement LogInPage;
	@FindBy(xpath = "//input[@formcontrolname='phonenumber']")private WebElement PhoneNumberEdt;
	@FindBy(xpath = "//button[.='Continue']") private WebElement ContinueBtn;
	
	//OTP Page
	
	@FindBy(xpath = "//p[.='Enter Your OTP']")private WebElement EnterOTPPage;
	@FindBy(xpath = "(//input[@autocomplete='one-time-code'])[1]")private WebElement OtpEdt;
	@FindBy(xpath = "//button[.='Resend otp']")private WebElement ResendOTPBtn;
	
	
	
	
	public Matrika_SignUp_Page_LogIn(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void SignUpAndLogin(WebDriver driver) throws Exception 
	
	{
		//Account Profile Icon In Home Page
		
		boolean accountIcon=AccountIcon.isDisplayed();
		System.out.println("Account Icon Displayed Is : "+accountIcon);
		Thread.sleep(2000);
		
		AccountIcon.click();
		Thread.sleep(2000);
		
		boolean youraccount=YourAccount.isDisplayed();
		System.out.println("Your Account Page Displayed Is : "+youraccount);
		Thread.sleep(2000);
		
		boolean loginbtn=LogInBtn.isDisplayed();
		System.out.println("LogIn Displayed Is : "+loginbtn);
		Thread.sleep(2000);
		
		boolean signup=SignUpBtn.isDisplayed();
		System.out.println("SignUp Displayed Is : "+signup);
		Thread.sleep(2000);
		
		SignUpBtn.click();
		Thread.sleep(2000);
		
		//SignUp Page
		
		boolean signuppage=SignUpPage.isDisplayed();
		System.out.println("SignUp Page Displayed Is : "+signuppage);
		Thread.sleep(2000);
		
		boolean fullname=EnterFullNameEdt.isDisplayed();
		System.out.println("Enter Full Name TextBox Displayed Is : "+fullname);
		Thread.sleep(2000);
		
		boolean mailid=MailIdEdt.isDisplayed();
		System.out.println("Enter Mail Id TextBox Displayed Is : "+mailid);
		Thread.sleep(2000);
		
		boolean mobilenum=MobileNumberEdt.isDisplayed();
		System.out.println("Mobile Number TextBox : "+mobilenum);
		Thread.sleep(2000);
		
		boolean referalcode=ReferalCodeEdt.isDisplayed();
		System.out.println("Referal Code TextBox : "+referalcode);
		Thread.sleep(2000);
		
		boolean checkbox=CheckBox.isDisplayed();
		System.out.println("CheckBox Displayed Is : "+checkbox);
		Thread.sleep(2000);
		
		boolean CreateAcnt=CreateAccountBtn.isDisplayed();
		System.out.println("Create Account Button Displayed Is : "+CreateAcnt);
		Thread.sleep(2000);
		
		boolean loginopt=LogInOpt.isDisplayed();
		System.out.println("LogIn Option Displayed Is : "+loginopt);
		Thread.sleep(2000);
		
		LogInOpt.click();
		Thread.sleep(2000);
		
		//Login page
		
		boolean loginpage=LogInPage.isDisplayed();
		System.out.println("LogIn Page Displayed Is : "+loginpage);
		Thread.sleep(2000);
		
		boolean phonenum=PhoneNumberEdt.isDisplayed();
		System.out.println("Phone Number TextBox Displayed : "+phonenum);
		Thread.sleep(2000);
		
		PhoneNumberEdt.sendKeys("6309631698");
		Thread.sleep(2000);
		
		boolean continuebtn=ContinueBtn.isDisplayed();
		System.out.println("Continue Button Displayed Is : "+continuebtn);
		Thread.sleep(2000);
		
		ContinueBtn.click();
		Thread.sleep(2000);
		
		//Enter OTP Page
		
		boolean enterotp=EnterOTPPage.isDisplayed();
		System.out.println("Enter OTP Page Displayed Is : "+enterotp);
		Thread.sleep(2000);
		
		boolean otpedt=OtpEdt.isDisplayed();
		System.out.println("OTP TextBoxes Displayed Is : "+otpedt);
		Thread.sleep(70000);
		
		boolean resend=ResendOTPBtn.isDisplayed();
		System.out.println("Resend OTP Button Displayed Is : "+resend);
		Thread.sleep(2000);
		
		OtpEdt.sendKeys("123456");
			
	}
}
