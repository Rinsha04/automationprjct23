package pagepckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fahraypage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/sticky-header/header/div/a[1]")
	WebElement myaccount;
	@FindBy(id="CustomerEmail")
	WebElement myemail;
	@FindBy(id="CustomerPassword")
	WebElement mypasword;
	@FindBy(xpath="//*[@id=\"customer_login\"]/button")
	WebElement singin;
	@FindBy(xpath="//*[@id=\"recaptcha-anchor\"]")
	WebElement robot;
	public Fahraypage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void click() {
		myaccount.click();
	}
	public void setvalue(String email,String password) {
		myemail.sendKeys(email);
		mypasword.sendKeys(password);
	}
	public void click2() {
		singin.click();
		}

}
