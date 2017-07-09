package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ZalandoPage {

	private WebDriver driver;

	@FindBy(css = ".job-search__button span")
	private static WebElement searchButton;

	@FindBy(partialLinkText = "jobs.zalando.de")
	private static WebElement jobsLink;

	@FindBy(css = ".jobtype-input")
	private static WebElement jobType;

	@FindBy(css = ".location-input")
	private static WebElement locationDropdown;

	@FindBy(css = ".label--results-count")
	private static WebElement resultPage;

	@FindBy(xpath = "//div[contains(@class, 'jobs-search-filters__results-count')]//strong")
	private static WebElement jobResultCount;

	@FindBy(css = ".pagination .-icon-arrow-right")
	private static WebElement nextButton;
	
	private static final String listResults = ".cards-container li";

	public ZalandoPage(WebDriver driver) {
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

	public WebElement hasNext() {
		boolean present = driver.findElements(By.cssSelector(".pagination .-icon-arrow-right")).size() > 0 ? true
				: false;

		return present ? nextButton : null;
	}

	public String getJobResultCount() {
		return jobResultCount.getText();
	}

	public WebElement waitForResultPage() {
		return resultPage;
	}
	

}
