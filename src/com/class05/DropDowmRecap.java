package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class DropDowmRecap extends CommonMethods {

	public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome",SYNTAX_PRACTICE_URL );
		driver.findElement(By.linkText("Input Forms")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Select Dropdown List")).click();
		Thread.sleep(2000);
		
		WebElement dd = driver.findElement(By.id("select-demo"));
		//to work with dd if the tagname starts with select, then we have to create a object of select class
		Select select = new Select(dd);
		//select 3 index
		select.selectByIndex(3);
		//byVisibleText
		select.selectByVisibleText("Friday");
		// by value
		select.selectByValue("Thursday");
		
		//how to get the count of a drop down items
		List<WebElement> options = select.getOptions();
		System.out.println(options.size());
	
		// we store all list by iterator, we can use also for each loop
		Iterator<WebElement> it = options.iterator();
		while(it.hasNext()) {
		it.next().click();
		Thread.sleep(2000);
		
		}	
		
		
	}

}
