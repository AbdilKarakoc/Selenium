package com.Review01;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class DynamicTable extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome",Constants.HRMS_URL);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']/b")).click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[3]"));
			int numberofrows=rows.size();
		
		
		String firsthalf ="//table[@id='resultTable']/tbody/tr[";
		String secondhalf="]/td[3]/";
	for(int i=1;i<numberofrows;i++) {
		String namepresent = driver.findElement(By.xpath(firsthalf+ i + secondhalf)).getText();
		
		
	}
}
}
