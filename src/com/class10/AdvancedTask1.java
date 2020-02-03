package com.class10;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class AdvancedTask1 extends CommonMethods{

		//Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
		//Login to the application by writing xpath based on “parent and child relation”
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("admin");
		driver.findElement(By.xpath("//div[@id='divPassword']/input")).sendKeys("Hum@nhrm123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
	}

}
