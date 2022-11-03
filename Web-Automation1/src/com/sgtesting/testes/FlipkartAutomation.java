package com.sgtesting.testes;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartAutomation {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
	}
public static  void  launchBrowser()
{
	try
	{
		System.setProperty("webdriver.chrome.driver","D:\\ExampleSeleniumAutomation\\Web-Automation1\\Library\\drivers\\chromedriver.exe");
		oBrowser =new ChromeDriver();
	}catch(Exception e )
	{
		e.printStackTrace();
	}
}
private static void navigate()
{
	try
	{
		oBrowser.get("https://www.flipkart.com/");
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
	oBrowser.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	oBrowser.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/div[1]/a/div[1]/div/img")).click();
	Thread.sleep(1000);
	WebElement a=oBrowser.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/span[3]"));
	Actions b=new Actions(oBrowser);
	b.moveToElement(a).build().perform();
	Thread.sleep(4000);
	oBrowser.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div/div[2]/a[4]")).click();
	Thread.sleep(2000);
	String x=oBrowser.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/h1")).getText();
	System.out.println(x);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
