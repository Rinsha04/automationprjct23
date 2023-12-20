package testpckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepckg.Search;

public class searchtest {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://shopfahrya.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() {
		Search ob=new Search(driver);
		ob.click();
		ob.value("single");
		ob.over();
	}
}
