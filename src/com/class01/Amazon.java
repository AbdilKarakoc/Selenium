package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://Amazon.com.com:Online Shoping for Electronics,Apparel,Computers,Books,DVDs & more");
		driver.get("http://amazon.com");
		//Thread.sleep(1000);
		

	}

}
