package pagepckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class viewcart {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"shopify-section-template--17215318229303__featured_collection\"]/div/div/div[2]/a")
	WebElement viewall;
	@FindBy(xpath="//*[@id=\"quick-add-template--17215318163767__product-grid8052485849399-submit\"]")
	WebElement addcart;
	@FindBy(xpath="//*[@id=\"cart-notification-form\"]/button")
	WebElement checkout;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="TextField1")
	WebElement lastname;
	@FindBy(id="shipping-address1")
	WebElement address;
	@FindBy(xpath="//*[@id=\"TextField2\"]")
	WebElement city;
	@FindBy (xpath="//*[@id=\"Select1\"]")
	WebElement state;
	@FindBy (id="Select1")
	WebElement pin;
	@FindBy(id="TextField4")
	WebElement phno;
	@FindBy(xpath="//*[@id=\"pay-button-container\"]/div/div/button")
	WebElement pay;
	public viewcart(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	public void click() {
		viewall.click();
	}
	public void click2() {
	
	addcart.click();
	}
	
	public void setvalue() {
		checkout.click();
	}
    public void setvalue2(String Email,String name,String adres
    		,String cityy,String stat) {
      email.sendKeys(Email);
      lastname.sendKeys(name);
      address.sendKeys(adres);
      city.sendKeys(cityy);
      state.sendKeys(stat);
    	
    }
    public void setvalue3(String Pin,String phonenumber) {
    	pin.sendKeys(Pin);
    	phno.sendKeys(phonenumber);
    }
 
    public void click4() {
    	pay.click();
    }
}
