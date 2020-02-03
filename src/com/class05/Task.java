package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Task extends CommonMethods {

//	TC 1: JavaScript alert text verification
	//Open chrome browser
	//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
	//Click on “Alerts & Modals” links
	//Click on “Javascript Alerts” links
	
	//Click on button in “Java Script Alert Box” section
	//Verify alert box with text “I am an alert box!” is present
	//Click on button in “Java Script Confirm Box” section
	//Verify alert box with text “Press a button!” is present
	//Click on button in “Java Script Alert Box” section
	//Enter text in the alert box
	//Quit browser
	
	public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		driver.findElement(By.linkText("Alerts & Modals")).click();
		driver.findElement(By.linkText("Javascript Alerts")).click();
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		
		String text=driver.findElement(By.xpath("//p[text()='Click the button to display an alert box:']")).getText();
		
		System.out.println(text);
		
		
		alert.accept();
	}

}
