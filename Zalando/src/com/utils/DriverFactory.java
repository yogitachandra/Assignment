package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

	public static WebDriver getDriver(String driverType) {

		WebDriver webDriver = null;
		switch (driverType) {
		case "chrome":
			System.setProperty(Constants.DRIVER_CHROME_PROPERTY, Constants.DRIVER_CHROME_PATH_LINUX64);
			webDriver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty(Constants.DRIVER_FIREFOX_PROPERTY,Constants.DRIVER_FIREFOX_PATH_WINDOWS64);
			webDriver = new FirefoxDriver();
			break;
		case "iexplorer":
			System.setProperty(Constants.DRIVER_IE_PROPERTY, Constants.DRIVER_IE_PATH);
			webDriver = new InternetExplorerDriver();
			break;
		default:
			webDriver = new FirefoxDriver();
			break;
		}

		return webDriver;
	}
}
