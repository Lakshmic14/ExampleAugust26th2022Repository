package com.sgtesting.testes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WThhreeSchool {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		logout();
		closeAplication();

	}
private static void launchBrowser()
{
	try
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\ExampleSeleniumAutomation\\Web-Automation1\\Library\\drivers\\chromedriver.exe");
	oBrowser =new ChromeDriver();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void navigate()
{
	try
	{
		oBrowser.get("https://profile.w3schools.com/");
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void login()
{
	try
	{
		oBrowser.findElement(By.name("email")).sendKeys("lakshmicgowda14@gmail.com");
		oBrowser.findElement(By.name("current-password")).sendKeys("Prema@12");
		oBrowser.findElement(By.xpath("//*[@id='root']/div/div/div[4]/div[1]/div/div[4]/div[1]/button")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private  static void logout()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id='navigation']/div/button")).click();
		//oBrowser.findElement(By.linkText("Log out")).click();
		Thread.sleep(8000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void closeAplication()
{
	try
	{
		oBrowser.close();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
