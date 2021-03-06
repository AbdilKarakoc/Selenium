package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class Homework2 extends CommonMethods{

	
		/*TC 1: Leave List Search Validation
		Open chrome browser
		Go to �http://166.62.36.207/humanresources/symfony/web/index.php/auth�
		Login into the application
		Select Leave List
		Select from December 1, 2019 until January 31, 2020
		Check only Pending approval
		Click on Search
		Validate �No Records Found� is displayed
		Quit the browser
		 */
		
	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Leave List")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("calFromDate"))));
		driver.findElement(By.id("calFromDate")).click();
		
		Thread.sleep(4000);
		
		WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select select=new Select(month);
		Thread.sleep(4000);
		select.selectByVisibleText("Dec");
		
		WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Thread.sleep(4000);
		Select select2=new Select(year);
		select2.selectByVisibleText("2019");
			
		List<WebElement> cells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
			for(WebElement cell: cells) {			
			if(cell.getText().equals("1")) {				
				cell.click();
				break;
	}

}
			driver.findElement(By.id("calToDate")).click();
			WebElement month1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			Select select3 = new Select(month1);
			Thread.sleep(3000);
			select3.selectByVisibleText("Jan");
			
		
			WebElement year1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			Select select4 = new Select(year1);
			Thread.sleep(3000);
			select4.selectByVisibleText("2020");
			
			List<WebElement> cells2=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
			for(WebElement cell2: cells2) {			
				if(cell2.getText().equals("31")) {				
					cell2.click();
					break;
					
					
	}
}
			WebElement pending= driver.findElement(By.id("leaveList_chkSearchFilter_checkboxgroup"));
			System.out.println("Pending is enabled= "+ pending.isEnabled());
			Thread.sleep(1000);
			driver.quit();
	}
}
