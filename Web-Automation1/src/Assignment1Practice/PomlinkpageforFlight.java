package Assignment1Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PomlinkpageforFlight {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\GITRepository\\CurrentWorksspace\\ExampleAugust26th2022Repository\\Web-Automation1\\Library\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	FlightregistrationOnPom opage=new FlightregistrationOnPom(driver);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.guru99.com/test/newtours/");
	
	opage.clickregLink();
	opage.setFirstName("laksh");
	opage.setLastName("gowda");
	opage.setPhonename("11111111111");
	opage.setEmail("mail@gmail.com");
	opage.setcity("bangalore");
	opage.setState("karnataka");
	opage.setpostalcode("560010");
	opage.setcontry("india");
	opage.setuser("lakshmi@gmail.com");
	opage.setpass("password");
	opage.setconpass("password");
	opage.setregbutton();
	//validation
	if(driver.getPageSource().contains("Thank you"))
	{
		System.out.println("registration succesfull");
	}
	else
	{
		System.out.println("registration failed");
	}
	
	
	
	}

}
