package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ZLabelsPage {

	private WebDriver driver;

	@FindBy(css = ".job-search__searchbar button")
	private static WebElement searchButton;

	@FindBy(partialLinkText = "jobs.zalando.de")
	private static WebElement jobsLink;

	@FindBy(css = ".job-search__searchbar input")
	private static WebElement jobType;

	@FindBy(css = ".job-search__searchbar select")
	private static WebElement locationDropdown;

	@FindBy(css = ".jobs-search-filters__filter-button button")
	private static WebElement filterButton;

	@FindBy(xpath = "//div//li[text()='Content Creation & Styling']")
	private static WebElement filterJobCatergory;

	@FindBy(xpath = "//div//span[contains(@class, 'card--job-result__title')]")
	private static WebElement jobResult;

	@FindBy(xpath = "//div[contains(@class,'card--job-result__categories-container')]/span")
	private static WebElement categoryResult;

	@FindBy(xpath = "//div[contains(@class, 'card--job-result__locations-container')]/span[2]")
	private static WebElement locationResult;
	
	@FindBy(xpath = "//div//span[contains(@class, 'card--job-result__brand')]")
	private static WebElement entityResult;
	

	public ZLabelsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnJobsLink() {
		jobsLink.click();
	}

	public void inputJobType(String type) {
		jobType.clear();
		jobType.sendKeys(type);
	}

	public void locationDropdown(String country) {

		Select location = new Select(locationDropdown);
		location.selectByValue(country);

	}

	public void clickSearchButton() {
		searchButton.click();
	}

	public void clickFilterJobsButton() {
		filterButton.click();
	}

	public void selectJobCategory() {
		filterJobCatergory.click();
	}

	public String getJobTitle(){
		 
		return jobResult.getText();
	}
	
	public String getJobCategory() {
		return categoryResult.getText();
	}
	
	public String getLocation(){
		return locationResult.getText();
	}
	
	public String getEntity(){
		return entityResult.getCssValue("background-image");	
	}
	
}
