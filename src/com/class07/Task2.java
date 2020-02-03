package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class Task2 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Add']"))).click();
		WebDriverWait waits = new WebDriverWait(driver, 30);
		boolean visiableText = driver.findElement(By.xpath("//p[@id='message']")).isDisplayed();
		if(visiableText) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
			
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
