package com.class08;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class Task2 extends CommonMethods {

	/*Open chrome browser
	Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
	Login to the application
	Verify customer “Susan McLaren” is present in the table
	Click on customer details
	Update customers last name and credit card info
	Verify updated customers name and credit card number is displayed in table
	Close browser

	 */
	public static void main(String[] args) {
		setUp("chrome","http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]")).click();
		
		List<WebElement> row=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
			for(int i=1; i<row.size(); i++) {
			String rowText=row.get(i-1).getText();
		
			if(rowText.contains("Susan McLaren")) {
				driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" + i + "]/td[13]")).click();
				
				WebDriverWait wait = new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Susan McLaren']")));
				driver.findElement(By.xpath("//input[@value='Susan McLaren']")).clear();
				driver.findElement(By.xpath("//input[@value='Susan McLaren']")).sendKeys("Susan Simith");
				driver.findElement(By.xpath("//input[@value='999888777888']")).clear();
				driver.findElement(By.xpath("//input[@value='999888777888']")).sendKeys("1111111111");
				driver.findElement(By.linkText("Update")).click();
				break;
			}
		}
		
		
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		for(int i=1; i<row.size(); i++) {
		String rowText=rows.get(i-1).getText();
		
		if(rowText.contains("Susan Simith")&& (rowText.contains("1111111111"))) {
			System.out.println("Test case Pass");
			
		
			break;
		}

}
	}
}
