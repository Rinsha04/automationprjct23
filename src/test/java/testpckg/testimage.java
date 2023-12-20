package testpckg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepckg.image;

public class testimage {
		WebDriver driver;
		@BeforeTest
		public void setup() {
			driver=new ChromeDriver();
			driver.get("https://shopfahrya.in/");
			driver.manage().window().maximize();
		}
		@Test
		public void test1() {
			image ob=new image(driver);
			ob.value();
			ob.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			ob.click1();
			
			
		}

}
 