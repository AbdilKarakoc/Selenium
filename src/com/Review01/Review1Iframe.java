package com.Review01;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
import com.utils.Constants;

/*Task 1:
As an analyst, I want to be able to click on an element inside any frame displayed on the homepage that will take me to the
respective page. Verify the landing page.
*/





public class Review1Iframe extends CommonMethods {

	
	public static void main(String[] args) throws InterruptedException {
		
			setUp("chrome","https://www.amazon.com");
			Thread.sleep(3000);
			
			switchToFrame(driver.findElement(By.xpath("//div[@id='ape_Gateway_right-2_desktop_placement']/iframe")));
			/*
			 * xpath to locate frame
			 * div[@id='ape_Gateway_right-2_desktop_placement']/iframe
			 */
			driver.findElement(By.className("clickthrough")).click();
	}

}
