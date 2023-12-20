package testpckg;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepckg.viewcart;

public class testcart {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://shopfahrya.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,850)","");	
	}
	@Test
	public void test1() {
		viewcart ob=new viewcart(driver);
		
		ob.click();
		ob.click2();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		ob.setvalue();
		ob.setvalue2("mubashirk@gmail.com", "rinsha", "kolamban(H)", "mannarkkad", "palakkad");
		ob.setvalue3("678582", "9747174861");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,850)","");	
		ob.click4();
	}
}
