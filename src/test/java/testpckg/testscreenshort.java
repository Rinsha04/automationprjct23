package testpckg;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepckg.screenshort;

public class testscreenshort {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://shopfahrya.in/");
		driver.manage().window().maximize();
	}
		@Test
		public void test1() throws Exception {
			screenshort ob=new screenshort(driver);
			ob.value();
			String actualtitle=driver.getTitle();
			System.out.println("title="+actualtitle);
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./Screenshort/fahry.png"));
		
		}
}
