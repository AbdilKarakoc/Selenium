package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class FileUpload extends CommonMethods {

	public static void main(String[] args) {
		
		setUp("chrome", "https://the-internet.herokuapp.com/upload");
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Lenovo\\Desktop\\abdil.pdf");
		driver.findElement(By.id("file-submit")).click();
		WebElement upload  = driver.findElement(By.xpath("//div[@id='uploaded-files']/preceding-sibling::h3"));
		
		if(upload.isDisplayed()) {
			System.out.println("done");
		}else {
			System.out.println("not done");
		}
		driver.quit();
	}

}
