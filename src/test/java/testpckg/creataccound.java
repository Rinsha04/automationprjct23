package testpckg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepckg.Creataccound;

public class creataccound {
	ChromeDriver driver;
	@BeforeTest
	public void setvalue() {
		driver=new ChromeDriver();
		driver.get("https://shopfahrya.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() {
		Creataccound ob=new Creataccound(driver);
	   
		ob.click();
		ob.copypast();
		ob.enter(" mubashirk234@gmail.com","rinsha23");
		ob.click1();
		ob.click();
	}

}
