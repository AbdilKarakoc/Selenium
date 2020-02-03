package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class JavaExecutorDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", Constants.HRMS_URL);
		driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("admin");
		driver.findElement(By.xpath("//div[@id='divPassword']/input")).sendKeys("Hum@nhrm123");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement loginBtn=driver.findElement(By.id("btnLogin"));
		js.executeScript("arguments[0].style.backgroundColor=‘AnyColor’", args);
		js.executeScript("arguments[0].click();", loginBtn);
		js.executeScript("window.scrollBy(0,02250");
		Thread.sleep(3000);
		driver.quit();
		

	}

}
