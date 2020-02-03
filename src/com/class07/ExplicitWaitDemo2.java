package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class ExplicitWaitDemo2 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		/*navigate to google
		 * search for wegmans
		 * clik on link "Wegmans Grocery Delivery | Power By Instacart"
		 * once we refirected to the site click "Log in"
		 * 
		 */
		setUp("chrome", "https://google.com");
		driver.findElement(By.name("q")).sendKeys("Wegmans",Keys.ENTER);
		driver.findElement(By.xpath("//h3[@class='LC20lb']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-in")));
		
		driver.findElement(By.id("sign-in")).click();
		System.out.println("Link was clicked.....");
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
