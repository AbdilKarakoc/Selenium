package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		final String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		if (expectedTitle.contentEquals(actualTitle)) {
			System.out.println("The actual and expected method match");
		}
		else {
			System.out.println("The actual and expectedtitle did not match");
		}
		System.out.println("*************************");
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		String expectedUrl = "https://www.google.com";
		if (expectedUrl.contentEquals(actualUrl)) {
			System.out.println("Both URL matched");
		}
		else {
			System.err.println("Actual and expected Not Matched");
		}
		driver.close();
	}
}