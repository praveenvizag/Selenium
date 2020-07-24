package com.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicExample {

	private WebDriver webDriver;
	
	public void innkeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Personal\\Seelnium\\drivers\\chromedriver.exe");
			webDriver = new ChromeDriver();
			webDriver.manage().deleteAllCookies();
			webDriver.manage().window().maximize();
			webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			webDriver.get("https://www.amazon.in");
			search();
		} catch (Exception e) {
			System.out.println("error " + e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	
	public void search() {
		webDriver.findElement(By.id("nav-link-accountList")).click();
		webDriver.findElement(By.id("ap_email")).sendKeys("8106036234");
		webDriver.findElement(By.id("continue")).submit();
		webDriver.findElement(By.id("ap_password")).sendKeys("Pravin8007@");
		webDriver.findElement(By.id("signInSubmit")).submit();
	}
	public static void main(String[] args) {

		BasicExample basicExample = new BasicExample();
		basicExample.innkeBrowser();
	}

}
