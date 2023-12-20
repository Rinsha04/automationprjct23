package pagepckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class image {
	WebDriver driver;
	@FindBy (xpath="//*[@id=\"CardLink-template--17215318229303__acaf319b-1e9c-44b8-90cd-a65f8140b52f-9050469499191\"]")
	WebElement image;
	@FindBy (xpath="//*[@id='product-form-template--17215318196535__main']/div/button")
	WebElement addcart ;
	@FindBy(xpath="//*[@id=\"cart-notification-button\"]")
	WebElement viewcart;
    @FindBy(xpath="//*[@id=\"Remove-2\"]/a/svg")
    WebElement stop;
	
	
	public image(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void value() {
		image.click();
		
		
	}
	public void click() {
		 addcart.click();
	}
	public void click1() {
		viewcart.click(); 
	}
	public void exit() {
		stop.click();
	}
}
