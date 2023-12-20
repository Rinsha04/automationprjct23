package pagepckg;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Creataccound {
WebDriver driver;
@FindBy(xpath="//*[@id=\"shopify-section-header\"]/sticky-header/header/div/a[1]")
WebElement myaccount;
@FindBy(xpath="//*[@id=\"customer_login\"]/a[2]")
WebElement creatac;
@FindBy(id="RegisterForm-FirstName")
WebElement firstname;
@FindBy(id="RegisterForm-LastName")
WebElement lastname;
@FindBy(id="RegisterForm-email")
WebElement email;
@FindBy(id="RegisterForm-password")
WebElement pass;
@FindBy(xpath="//*[@id=\"create_customer\"]/button")
WebElement submit;
 public  Creataccound(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
			 
 }  

 public void click() {
	 myaccount.click();
	 creatac.click();
 }
 public void copypast() {
	 Actions act=new Actions(driver);
	 firstname.sendKeys("rinshak");
	act.keyDown(firstname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(firstname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(lastname,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
 }
 public void enter(String Email,String password) {
	 email.sendKeys(Email);
	 pass.sendKeys(password);
	 
 }
public void click1() {
	submit.click();
}
}
