package com.utils;

public class Constants {
	
	//For running test on chrome
	public static final String DRIVER_CHROME = "chrome";
	public static final String DRIVER_CHROME_PROPERTY = "webdriver.chrome.driver";
	public static final String DRIVER_CHROME_PATH_WINDOWS32 = "lib/chromedriver.exe";
	public static final String DRIVER_CHROME_PATH_LINUX64 = "lib/chromedriver";
	
	//For running test on firefox
	public static final String DRIVER_FIREFOX = "firefox";
	public static final String DRIVER_FIREFOX_PROPERTY = "webdriver.firefox.marionette";
	public static final String DRIVER_FIREFOX_PATH_WINDOWS64 = "lib/geckodriver.exe";
	public static final String DRIVER_FIREFOX_PATH_LINUX64 = "lib/geckodriver";

	
	//For running test on ie
	public static final String DRIVER_IE = "iexplorer";
	public static final String DRIVER_IE_PROPERTY = "webdriver.ie.driver";
	public static final String DRIVER_IE_PATH = null;

	
	public static final long TIME = 10;

	//ZLABEL constants
	public static final String BASEURL_ZALABEL = "https://zlabels.com/jobs";
	public static final String JOB_TYPE_ZLABEL = "Fuﬂ Fitting Model";
	public static final String JOB_LOCATION_ZLABEL = "Berlin";


	//ZALANDO constants
	public static final String BASEURL_ZALANDO = "https://www.zalando.de/jobs/";
	public static final String JOB_TYPE_ZALANDO = "Analyst";
	public static final String JOB_LOCATION_ZALANDO = "Berlin";



}
