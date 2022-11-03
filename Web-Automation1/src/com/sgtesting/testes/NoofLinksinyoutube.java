package com.sgtesting.testes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoofLinksinyoutube {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		linksinyoutube();
		closeApplication();
		
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
			oBrowser.get("https://www.youtube.com/");
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void linksinyoutube()
	{
		try
		{
			List<WebElement>olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			//List<WebElement>olinks=oBrowser.findElements(By.tagName("a"));
			int linkscount=olinks.size();
			System.out.println(" number of inks:"+linkscount);
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void closeApplication()
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
