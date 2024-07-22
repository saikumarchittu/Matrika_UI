package ObjectRerpository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;

public class Matrika_HomePage {


	WebDriverUtility wu=new WebDriverUtility();
	
	@FindBy (xpath = "//img[@class='matrika-logo']") private WebElement MatrikaLogo;
	@FindBy (xpath = "//img[@class='gold-sikka-logo']") private WebElement GoldSikkaLogo;
	@FindBy (xpath  = "//select[@formcontrolname='selectedCategory']") private WebElement SelectCategoryDropDown;	
	@FindBy (xpath = "//p[.='Account']") private WebElement AccountIcon;
	@FindBy (xpath = "//p[.='Wishlist']") private WebElement WishListIcon;	
	@FindBy (xpath = "//p[.='Cart']") private WebElement CartIcon;	
	@FindBy (xpath = "//h2[.=' Waist ']") private WebElement Waist;	
	@FindBy (xpath = "//h2[.=' Leg Part ']") private WebElement LegPart;	
	@FindBy (xpath = "//h2[.=' Earrings ']") private WebElement Earrings;
	@FindBy (xpath = "//h2[.=' Fingers ']") private WebElement Fingers;
	@FindBy (xpath = "//h2[.=' Wrist ']") private WebElement Wrist;
	@FindBy (xpath = "//h2[.=' Upper Arm ']") private WebElement UpperArm;
	@FindBy (xpath = "//h2[.=' Nose ']") private WebElement Nose;
	@FindBy (xpath = "//h2[.=' Head ']") private WebElement Head;
	@FindBy (xpath = "//h2[.=' Giftcards ']") private WebElement GiftCards;
	@FindBy (xpath = "//p[.='Live Rates']") private WebElement LiveRates;
	@FindBy (xpath = "(//p[@class='live-para'])[2]") private WebElement Liverates24K;
	@FindBy (xpath = "(//p[@class='live-para'])[3]") private WebElement Liverates22K;
	@FindBy (xpath = "(//p[@class='live-para'])[4]") private WebElement SilverLiverate;
	@FindBy (xpath = "//p[.='Shop By Categories']") private WebElement ShopByCategories;
	@FindBy (xpath = "(//p[.='Matrika Promises'])[1]") private WebElement MatrikaPromises;
//	@FindBy (xpath = "(//p[.='Assured Lifetime Maintenance'])[1]") private WebElement AssuredLifetimeMaintenance;
//	@FindBy (xpath = "(//p[.='Purity 24k(999 Purity)'])[1]") private WebElement Purity24k;
//	@FindBy (xpath = "(//p[.='Easy Exchange'])[1]") private WebElement EasyExchange;
//	@FindBy (xpath = "(//p[.='Your Jewellery is Insured'])[1]") private WebElement YourJewelleryIsInsured;
//	@FindBy (xpath = "(//p[.='14 Days Return Policy'])[1]") private WebElement ReturnPolicy;
//	@FindBy(xpath = "(//p[.='Guaranteed Buyback'])[1]") private WebElement GuarantedBuyback;
//	@FindBy (xpath = "(//p[.='Complete Transparency'])[1]") private WebElement CompleteTransparency;
//	@FindBy (xpath = "(//p[.='Security'])[1]") private WebElement Security;
	@FindBy (xpath = "//p[.='Top Picks For You']") private WebElement TopPicksForyou;
	@FindBy (xpath = "//p[.='A Special Gift']") private WebElement ASpecialGift;
	@FindBy (xpath = "//p[.='Desirable Ornaments']") private WebElement DesirableOrnaments;
	@FindBy (xpath = "//p[.='New Arrivals']") private WebElement NewArrivals;
	@FindBy (xpath = "//p[.=' Festive & Brides Jewellery']") private WebElement FestiveBridesJewellery;
	@FindBy (xpath = "//p[.='Deals Of The Day']") private WebElement DealsOfTheDay;
	@FindBy (xpath = "(//p[@class='gold-sikka-para'])[1]") private WebElement RegisteredOfficeAddress;
	@FindBy (xpath = "(//p[@class='gold-sikka-para'])[2]") private WebElement JewelleryWholesaleShopAddress;
	@FindBy (xpath = "(//p[@class='gold-sikka-para'])[3]") private WebElement BullionRetailShopAddress;
	@FindBy (xpath = "(//p[@class='gold-sikka-para'])[4]") private WebElement CorporateOfficeAddress;
	@FindBy (xpath = "//p[.='Matrika Collections']") private WebElement MatrikaCollections;
	@FindBy (xpath = "//p[.='Contact Us']") private WebElement ContactUs;
	@FindBy (xpath = "//p[.='Follow Us']") private WebElement FollowUs;
	@FindBy (xpath = "//a[@href='https://www.facebook.com/matrika.goldsikka']") private WebElement FacebookIcon;
	@FindBy (xpath = "//a[@href='https://www.instagram.com/matrika_goldsikka/']") private WebElement InstagramIcon;
	@FindBy (xpath = "//a[@href='https://www.youtube.com/@matrika_goldsikka']") private WebElement YoutubeIcon;
	@FindBy (xpath = "//a[@href='https://www.linkedin.com/company/goldsikkalimited/']") private WebElement LinkedinIcon;
	@FindBy (xpath = "//a[@href='https://twitter.com/i/flow/login?redirect_after_login=%2Fmatrika_gs']") private WebElement TwitterIcon;
	@FindBy (xpath = "//a[@href='https://in.pinterest.com/Matrika_goldsikka/']") private WebElement PintrestIcon;
	@FindBy (xpath = "(//span[.='X-YUG Technologies'])[1]") private WebElement XYugLnk;
	@FindBy (xpath = "(//p[.='We Accept:'])[1]") private WebElement WeAccept;
	@FindBy (xpath = "(//img[@class='visa-img'])[1]") private WebElement Visa;
	
	
	public Matrika_HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void HomePageElements(WebDriver driver) throws Exception 
	{
		wu.takeScreenShot(driver, "Matrika HomePage");
		
		boolean matrikalogo=MatrikaLogo.isDisplayed();
		System.out.println("Matrika Logo Displayed Is : "+matrikalogo);
		Thread.sleep(2000);
		
		boolean goldsikka=GoldSikkaLogo.isDisplayed();
		System.out.println("GoldSikka Logo Displayed Is : "+goldsikka);
		Thread.sleep(2000);
		
		boolean selectcategory=SelectCategoryDropDown.isDisplayed();
		System.out.println("Select Category Displayed Is : "+selectcategory);
		Thread.sleep(2000);
		
		boolean account=AccountIcon.isDisplayed();
		System.out.println("Accont Icon Displayed Is : "+account);
		Thread.sleep(2000);
		
		boolean wishlist=WishListIcon.isDisplayed();
		System.out.println("Wishlist Icon Displayed Is : "+wishlist);
		Thread.sleep(2000);
		
		boolean cart=CartIcon.isDisplayed();
		System.out.println("Cart Icon Displayed Is : "+cart);
		Thread.sleep(2000);
		
	    boolean waist=Waist.isDisplayed();
	    System.out.println("Waist Category Displayed Is : "+waist);
	    Thread.sleep(2000);
	    
	    boolean legpart=LegPart.isDisplayed();
	    System.out.println("Lag Part Category Displayed Is : "+legpart);
	    Thread.sleep(2000);
	    
	    boolean earrings=Earrings.isDisplayed();
	    System.out.println("Earrings Category Displayed Is : "+earrings);
	    Thread.sleep(2000);
	    
	    boolean fingers=Fingers.isDisplayed();
	    System.out.println("Fingers Category Displayed Is :"+fingers);
	    Thread.sleep(2000);
	    
	    boolean wrist=Wrist.isDisplayed();
	    System.out.println("Wrist Category Displayed Is : "+wrist);
	    Thread.sleep(2000);
	    
	    boolean upperarm=UpperArm.isDisplayed();
	    System.out.println("Upper Arm Category Displayed Is : "+upperarm);
	    Thread.sleep(2000);
	    
	    boolean nose=Nose.isDisplayed();
	    System.out.println("Nose Category Displayed Is : "+nose);
	    Thread.sleep(2000);
	    
	    boolean head=Head.isDisplayed();
	    System.out.println("Head Category Displayed Is : "+head);
	    Thread.sleep(2000);
	    
	    boolean giftcard=GiftCards.isDisplayed();
	    System.out.println("Gift Cards Category Displayed Is :"+giftcard);
	    Thread.sleep(2000);
	    
	    wu.scrolldown(driver);
	    Thread.sleep(2000);
	    
	    wu.takeScreenShot(driver, "Live Rates");
	    Thread.sleep(2000);
	    
	    boolean liverates=LiveRates.isDisplayed();
	    System.out.println("Live Rates Displayed Is : "+liverates);
	    Thread.sleep(2000);
	    
	    boolean liverates24k=Liverates24K.isDisplayed();
	    System.out.println("Live Rates Of 24K Displayed Is : "+liverates24k);
	    Thread.sleep(2000);
	    
	    boolean liverates22k=Liverates22K.isDisplayed();
	    System.out.println("Live Rates 22K Displayed Is : "+liverates22k);
	    Thread.sleep(2000);
	    
	    wu.scrolldown1(driver);
	    Thread.sleep(2000);
	    
	    wu.takeScreenShot(driver, "Shop By Categories");
	    Thread.sleep(2000);
	    
	    boolean shopbycategories=ShopByCategories.isDisplayed();
	    System.out.println("Shop By Categories Displayed Is : "+shopbycategories);
	    Thread.sleep(2000);
	    
	    wu.scrolldown(driver);
	    Thread.sleep(2000);
	    
	    wu.takeScreenShot(driver, "Matrika Promises");
	    Thread.sleep(2000);
	    
	    boolean matrikapromises=MatrikaPromises.isDisplayed();
	    System.out.println("Matrika Promises : "+matrikapromises);
	    Thread.sleep(2000);
	    
	    wu.scrolldown(driver);
	    Thread.sleep(2000);
	   	    
	    wu.takeScreenShot(driver, "Top Picks For You");
	    Thread.sleep(2000);
	    
	    boolean toppicksforyou=TopPicksForyou.isDisplayed();
	    System.out.println("Top Picks For You : "+toppicksforyou);
	    Thread.sleep(2000);
	    
	    wu.scrolldown(driver);
	    Thread.sleep(2000);
	    wu.scrolldown3(driver);
	    Thread.sleep(2000);
	    
	    wu.takeScreenShot(driver, "A Special Gift");
	    Thread.sleep(2000);
	    
	    boolean Aspecialgift=ASpecialGift.isDisplayed();
	    System.out.println("A Special Gift Displayed Is : "+Aspecialgift);
	    Thread.sleep(2000);
	    
	    wu.scrolldown(driver);
	    Thread.sleep(2000);
	    wu.scrolldown2(driver);
	    Thread.sleep(2000);
	    
	    wu.takeScreenShot(driver, "Desirable Ornaments");
	    Thread.sleep(2000);
	    
	    boolean desirableornaments=DesirableOrnaments.isDisplayed();
	    System.out.println("Desirable Ornaments Displayed Is : "+desirableornaments);
	    Thread.sleep(2000);
	    
	    
	    wu.scrolldown(driver);
	    Thread.sleep(2000);
	    wu.scrolldown1(driver);
	    Thread.sleep(2000);
	    
	    wu.takeScreenShot(driver, "New Arrivals");
	    Thread.sleep(2000);
	    
	    boolean newarrivals=NewArrivals.isDisplayed();
	    System.out.println(" New Arrivals Displayed Is : "+newarrivals);
	    Thread.sleep(2000);
	    
	    wu.scrolldown(driver);
	    Thread.sleep(2000);
	    wu.scrolldown3(driver);
	    Thread.sleep(2000);
	   
	    wu.takeScreenShot(driver, "Festive & Brides jewellery");
	    Thread.sleep(2000);
	    
	    boolean festivebridesjewellery=FestiveBridesJewellery.isDisplayed();
	    System.out.println("Festive Brides Jewellery Displayed Is : "+festivebridesjewellery);
	    Thread.sleep(2000);
	    
	    wu.scrolldown(driver);
	    Thread.sleep(2000);
	    wu.scrolldown1(driver);
	    Thread.sleep(2000);
	    
	    wu.takeScreenShot(driver, "Deals Of The Day");
	    Thread.sleep(2000);
	    
	    boolean dealoftheday=DealsOfTheDay.isDisplayed();
	    System.out.println("Deals Of The Day Displayed Is : "+dealoftheday);
	    Thread.sleep(2000);
	    
	    wu.scrolldown1(driver);
	    Thread.sleep(2000);
	    
	    wu.takeScreenShot(driver, "Addresses");
	    Thread.sleep(2000);
	    
	    wu.scrolldown(driver);
	    Thread.sleep(2000);
	    
	    
	    boolean registeredOfficeAddress=RegisteredOfficeAddress.isDisplayed();
	    System.out.println("Registered Office Address Displayed Is : "+registeredOfficeAddress);
	    Thread.sleep(2000);
	    
	    boolean jewelleryWholeSale=JewelleryWholesaleShopAddress.isDisplayed();
	    System.out.println("Jewellery WholeSale Shop Address Displayed Is : "+jewelleryWholeSale);
	    Thread.sleep(2000);
	    
	    boolean bullionretail=BullionRetailShopAddress.isDisplayed();
	    System.out.println("Bullion Retail Shop Adderss Displayed Is : "+bullionretail);
	    Thread.sleep(2000);
	    
	    boolean corporateoffice=CorporateOfficeAddress.isDisplayed();
	    System.out.println("Corporate Office Address Displayed Is : "+corporateoffice);
	    Thread.sleep(2000);
	    
	    wu.scrolldown(driver);
	    Thread.sleep(2000);
	    
	    wu.takeScreenShot(driver, "Page End");
	    Thread.sleep(2000);
	   	    
	    boolean matrikaCollections=MatrikaCollections.isDisplayed();
	    System.out.println("Matrika Collections Displayed Is : "+matrikaCollections);
	    Thread.sleep(2000);
	    
	    boolean contactUs=ContactUs.isDisplayed();
	    System.out.println("Contact US Displayed Is : "+contactUs);
	    Thread.sleep(2000);
	    
	    boolean followus=FollowUs.isDisplayed();
	    System.out.println("Follow Us Displayed Is : "+followus);
	    Thread.sleep(2000);
	    
	    boolean facebook=FacebookIcon.isDisplayed();
	    System.out.println("FaceBook Icon Displayed Is : "+facebook);
	    Thread.sleep(2000);
	    
	    boolean instagram=InstagramIcon.isDisplayed();
	    System.out.println("Instagram Icon Displayed Is : "+instagram);
	    Thread.sleep(2000);
	    
	    boolean youtube=YoutubeIcon.isDisplayed();
	    System.out.println("YouTube Icon Displayed Is : "+youtube);
	    Thread.sleep(2000);
	    
	    boolean linkedIn=LinkedinIcon.isDisplayed();
	    System.out.println("LinkedIn Icon Displayed Is : "+linkedIn);
	    Thread.sleep(2000);
	    
	    boolean twitter=TwitterIcon.isDisplayed();
	    System.out.println("Twitter Icon Displayed Is : "+twitter);
	    Thread.sleep(2000);
	    
	    boolean pintrest=PintrestIcon.isDisplayed();
	    System.out.println("Pintrest Icon Displayed Is : "+pintrest);
	    Thread.sleep(2000);
	    
	    boolean xyug=XYugLnk.isDisplayed();
	    System.out.println("X-YUG Link Displayed Is : "+xyug);
	    Thread.sleep(2000);
	    
	    boolean weaccept=WeAccept.isDisplayed();
	    System.out.println("We Accept Displayed Is : "+weaccept);
	    Thread.sleep(2000);
	    
	    boolean visa=Visa.isDisplayed();
	    System.out.println("Visa Displayed Is : "+visa);
	    	    
	}	
	
}