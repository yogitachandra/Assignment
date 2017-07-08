package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.*;

@Test
public class PageObjectModel {

	private static WebDriver driver;

	@BeforeTest
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/SelDrivers/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public static void test1() {
		String baseUrl = "https://zlabels.com/jobs";
		driver.get(baseUrl);
		ZLabelsPage page = new ZLabelsPage(driver);

		page.clickOnJobsLink();
		page.inputJobType("Fu� Fitting Model");
		page.locationDropdown("Berlin");
		page.clickSearchButton();
		page.clickFilterJobsButton();
		page.selectJobCategory();

		// assertions
		Assert.assertTrue(page.getJobTitle().matches("Fu� Fitting Model(.*)"), "Title does not contain FU� FITTING ");
		Assert.assertEquals(page.getJobCategory(), "Content Creation & Styling", "Job Category");
		Assert.assertEquals(page.getLocation(), "Berlin", "location");
		Assert.assertTrue(page.getEntity().matches("(.*).brand-zlabels(.*)"), "should be " + page.getEntity());
	}

/*@Test	
	 public static void test2( ) { 
	String baseUrl = "https://www.zalando.de/jobs/";
	driver.get(baseUrl);
		 ZalandoPage page = new ZalandoPage(driver);
		 
		page.inputJobType("Analyst");
		page.locationDropdown("Berlin");
		page.locationDropdown("Netherlands");
		page.locationDropdown("Helsinki");
		page.clickSearchButton();
System.out.println(page.getEntity()); }
	 */

	@AfterTest

	public void cleanUp() {

		driver.close();
	}

}