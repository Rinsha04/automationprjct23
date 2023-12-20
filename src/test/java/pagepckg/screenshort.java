package pagepckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class screenshort {
	WebDriver driver;
	@FindBy (xpath="//*[@id=\"shopify-section-header\"]/sticky-header/header/nav/ul/li[4]/a")
	WebElement discount;

	public screenshort(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void value() {
		discount.click();
	}
	

}
