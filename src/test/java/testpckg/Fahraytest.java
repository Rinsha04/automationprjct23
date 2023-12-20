package testpckg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepckg.Fahraypage;
 
public class Fahraytest {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://shopfahrya.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@Test
	public void test1() {
		Fahraypage ob=new Fahraypage(driver);
		ob.click();
		ob.setvalue("mubashirk2340@gmail.com", "rinumubu4040");
		
		ob.click2();
		
	}
	

}
