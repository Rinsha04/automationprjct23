package pagepckg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
WebDriver driver;
@FindBy(xpath="//*[@id=\"shopify-section-header\"]/sticky-header/header/div/details-modal/details/summary")
WebElement searchkey;
@FindBy(id="Search-In-Modal")
WebElement element;
@FindBy(xpath="//*[@id=\"predictive-search-option-1\"]/a/div/div/div/div[2]/span[2]/s")
WebElement option;
@FindBy(xpath="//*[@id=\"product-form-template--17215318196535__main\"]/div/div/div/div/div/button[1]")
WebElement buynow;
 public Search(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 public void click() {
	 searchkey.click();
 }
 public void value(String word) {
	 element.sendKeys(word);
 }
 public void over() {
		option.click();
		buynow.click();
 }
}
