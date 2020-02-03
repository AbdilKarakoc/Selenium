package com.class10;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class AdvancedXpathTask2 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
			//Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
			//Login to the application by writing xpath based on “following and preceding siblings”

		setUp("chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		driver.findElement(By.xpath("//span[text()='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("////input[@name='txtPassword']/following-sibling::span")).sendKeys("Hum@nhrm123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
	}

	}


