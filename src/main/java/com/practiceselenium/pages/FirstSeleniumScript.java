package com.practiceselenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class FirstSeleniumScript {

	static WebDriver driver = null;

	public static void main(String[] args) {

		// String path ="";
		// System.setProperty("webdriver.gecko.driver",
		// "Users/scroy/Desktop/Workspace_Eclipse/SeleniumDemo/drivers/geckodriver");

		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.com");

		driver.findElement(By.id("lst-ib")).sendKeys("Hello Suman!!!");

	}

}
