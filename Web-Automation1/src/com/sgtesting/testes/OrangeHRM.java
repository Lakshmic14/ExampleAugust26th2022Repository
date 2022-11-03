package com.sgtesting.testes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
				launchBrowser();
		navigate();
		login();
		selectAbout();
		Logout();
	}
	public static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleSeleniumAutomation\\Web-Automation1\\Library\\drivers\\chromedriver.exe");
			oBrowser =new ChromeDriver();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try
		{
			
			oBrowser.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("Admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("admin123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void selectAbout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[1]/a")).click();
			Thread.sleep(2000);
			
			String o1=oBrowser.findElement(By.xpath("//*[@id='app']/div[2]/div/div/div/div[2]/div[1]/p")).getText();
			System.out.println(o1);
		Thread.sleep(2000);
		List<WebElement> olink=oBrowser.findElements(By.xpath("//*[@id='app']/div[2]/div/div/div/div[2]/div[2]/p"));
		int a=olink.size();
		for(int i=0;i<olink.size();i++)
		{
			WebElement b=olink.get(i);
			String c=b.getText();
			System.out.println(c);
		}
		System.out.println(a);
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try
		{
			
			oBrowser.findElement(By.xpath("//*[@id='app']/div[2]/div/div/div/button")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}
	


