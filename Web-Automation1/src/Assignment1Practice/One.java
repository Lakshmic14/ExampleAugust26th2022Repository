package Assignment1Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimiZE();
		CreateUser1();
		CreateUser2();
		CreateUser3();
		logout();
		LoginUser1();
		Logoutuser1();
		LoginUser2();
		Logoutuser2();
		LoginUser3();
		Logoutuser3();
		SecondtimeLoginUser1();
		modifyUser1();
		SecondTimeLogoutuser1();
		SecondtimeLoginUser2();
		modifyUser2();
		SecondtimeLogoutuser2();
		SecondtimeLoginUser3();
		modifyUser3();
		SecondtimeLogoutuser3();
		ThirdtimeLoginUser1();
		ThirdtimeLogoutuser1();
		ThirdtimeLoginUser2();
		thirdtimeLogoutuser2();
		ThirdtimeLoginUser3();
		ThirdtimeLogoutuser3();
		Secondtimeloginasadmin();
		AdminModifyusers();
		SecondtimeAdminlogout();
		fourthtimeLoginUser1();
		fourthtimeUser1logout();
		fourthtimeLoginUser2();
		fourtimeuser2logout();
		fourthtimeLoginUser3();
		fourthtimeuser3logout();
		ThirdtimeadminLogin();
		DeleteUesers();
		ThirdtimeAdminlogout();
		CloseBrowser();
	}
private static void launchBrowser()
{
	try
	{
		System.setProperty("webdriver.chrome.driver","D:\\ExampleSeleniumAutomation\\Web-Automation1\\Library\\drivers\\chromedriver.exe");
	oBrowser=new ChromeDriver();
	Thread.sleep(1000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void navigate()
{
	try
	{
		oBrowser.get("http://localhost/login.do\r\n");
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
		oBrowser.findElement(By.name("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void minimiZE()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']")).click();
		Thread.sleep(3000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void CreateUser1()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.name("firstName")).sendKeys("laksh");
		oBrowser.findElement(By.name("middleName")).sendKeys("c");
		oBrowser.findElement(By.name("lastName")).sendKeys("gowda");
		oBrowser.findElement(By.name("email")).sendKeys("lakshmi@gmail.com");
		oBrowser.findElement(By.name("username")).sendKeys("lakshmigowda");
		oBrowser.findElement(By.name("password")).sendKeys("123456");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("123456");
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
		Thread.sleep(3000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void CreateUser2()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.name("firstName")).sendKeys("aksh");
		oBrowser.findElement(By.name("middleName")).sendKeys("a");
		oBrowser.findElement(By.name("lastName")).sendKeys("abadi");
		oBrowser.findElement(By.name("email")).sendKeys("akshatha@gmail.com");
		oBrowser.findElement(By.name("username")).sendKeys("akshatha ambadi");
		oBrowser.findElement(By.name("password")).sendKeys("121212");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("121212");
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
		Thread.sleep(3000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void CreateUser3()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.name("firstName")).sendKeys("shriya");
		oBrowser.findElement(By.name("middleName")).sendKeys("s");
		oBrowser.findElement(By.name("lastName")).sendKeys("tapase");
		oBrowser.findElement(By.name("email")).sendKeys("shriya@gmail.com");
		oBrowser.findElement(By.name("username")).sendKeys("shriyatapase");
		oBrowser.findElement(By.name("password")).sendKeys("123123");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("123123");
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
		Thread.sleep(3000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void logout()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void LoginUser1()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("lakshmigowda");
		oBrowser.findElement(By.name("pwd")).sendKeys("123456");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();

	}catch(Exception e)

	{
		e.printStackTrace();
	}
}
private static void Logoutuser1()
{
	try
	{
		oBrowser.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);

	}catch(Exception e)

	{
		e.printStackTrace();
	}
}
private static void LoginUser2()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("akshatha ambadi");
		oBrowser.findElement(By.name("pwd")).sendKeys("121212");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();

	}catch(Exception e)

	{
		e.printStackTrace();
	}
}
private static void Logoutuser2()
{
	try
	{
		oBrowser.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);

	}catch(Exception e)

	{
		e.printStackTrace();
	}
}
private static void LoginUser3()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("shriyatapase");
		oBrowser.findElement(By.name("pwd")).sendKeys("123123");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();

	}catch(Exception e)

	{
		e.printStackTrace();
	}
}
private static void Logoutuser3()
{
	try
	{
		oBrowser.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);

	}catch(Exception e)

	{
		e.printStackTrace();
	}
}
private static void SecondtimeLoginUser1()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("lakshmigowda");
		oBrowser.findElement(By.name("pwd")).sendKeys("123456");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();

	}catch(Exception e)

	{
		e.printStackTrace();
	}
}
private static void modifyUser1()
{
	try
	{

		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//span[text()='gowda, laksh c.']")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.name("password")).sendKeys("laksh");
		Thread.sleep(1000);
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("laksh");
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
		Thread.sleep(2000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void SecondTimeLogoutuser1()
{
	try
	{
		oBrowser.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);

	}catch(Exception e)

	{
		e.printStackTrace();
	}
}
private static void SecondtimeLoginUser2()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("akshatha ambadi");
		oBrowser.findElement(By.name("pwd")).sendKeys("121212");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();

	}catch(Exception e)

	{
		e.printStackTrace();
	}
}
private static void modifyUser2()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//span[text()='abadi, aksh a.']")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.name("password")).sendKeys("aksh");
		Thread.sleep(1000);
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("aksh");
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void SecondtimeLogoutuser2()
{
	try
	{
		oBrowser.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);

	}catch(Exception e)

	{
		e.printStackTrace();
	}
}
private static void SecondtimeLoginUser3()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("shriyatapase");
		oBrowser.findElement(By.name("pwd")).sendKeys("123123");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
Thread.sleep(2000);
	}catch(Exception e)

	{
		e.printStackTrace();
	}
}
private static void modifyUser3()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//span[text()='tapase, shriya s.']")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.name("password")).sendKeys("shriya");
		Thread.sleep(1000);
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("shriya");
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void SecondtimeLogoutuser3()
{
	try
	{
		oBrowser.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);

	}catch(Exception e)

	{
		e.printStackTrace();
	}
}
private static void ThirdtimeLoginUser1()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("lakshmigowda");
		oBrowser.findElement(By.name("pwd")).sendKeys("laksh");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
Thread.sleep(2000);
	}catch(Exception e)

	{
		e.printStackTrace();
	}
}
private static void ThirdtimeLogoutuser1()
{
	try
	{
		oBrowser.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);

	}catch(Exception e)

	{
		e.printStackTrace();
	}
}
private static void ThirdtimeLoginUser2()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("akshatha ambadi");
		oBrowser.findElement(By.name("pwd")).sendKeys("aksh");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
Thread.sleep(2000);
	}catch(Exception e)

	{
		e.printStackTrace();
	}
}
private static void thirdtimeLogoutuser2()
{
	try
	{
		oBrowser.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);

	}catch(Exception e)

	{
		e.printStackTrace();
	}
}
private static void ThirdtimeLoginUser3()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("shriyatapase");
		oBrowser.findElement(By.name("pwd")).sendKeys("shriya");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();

	}catch(Exception e)

	{
		e.printStackTrace();
	}
}
private static void ThirdtimeLogoutuser3()
{
	try
	{
		oBrowser.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);

	}catch(Exception e)

	{
		e.printStackTrace();
	}
}
private static void Secondtimeloginasadmin()
{
	try
	{
		oBrowser.findElement(By.name("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
	private static void AdminModifyusers()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//span[text()='gowda, laksh c.']")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.name("password")).sendKeys("lakshmi");
				Thread.sleep(1000);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("lakshmi");
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//span[text()='abadi, aksh a.']")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.name("password")).sendKeys("akshata");
				Thread.sleep(1000);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("akshata");
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//span[text()='tapase, shriya s.']")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.name("password")).sendKeys("shriya1");
				Thread.sleep(1000);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("shriya1");
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
				Thread.sleep(2000);
				

			}catch(Exception e)

			{
				e.printStackTrace();
			}
		}
		private static void SecondtimeAdminlogout()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);

			}catch(Exception e)

			{
				e.printStackTrace();
			}
		}
		private static void fourthtimeLoginUser1()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("lakshmigowda");
				oBrowser.findElement(By.name("pwd")).sendKeys("lakshmi");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(1000);
			}catch(Exception e)

			{
				e.printStackTrace();
			}
		}
		private static void fourthtimeUser1logout()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);

			}catch(Exception e)

			{
				e.printStackTrace();
			}
		}
		private static void fourthtimeLoginUser2()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("akshata ambadi");
				oBrowser.findElement(By.name("pwd")).sendKeys("akshata");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(1000);
				
			}catch(Exception e)

			{
				e.printStackTrace();
			}
		}
		private static void fourtimeuser2logout()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);

			}catch(Exception e)

			{
				e.printStackTrace();
			}
		}
		private static void fourthtimeLoginUser3()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("shriyatapase");
				oBrowser.findElement(By.name("pwd")).sendKeys("shriya1");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(1000);
				

			}catch(Exception e)

			{
				e.printStackTrace();
			}
		}
		private static void fourthtimeuser3logout()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);

			}catch(Exception e)

			{
				e.printStackTrace();
			}
		}
		private static void ThirdtimeadminLogin()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(1000);

			}catch(Exception e)

			{
				e.printStackTrace();
			}
		}
		private static void DeleteUesers()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//span[text()='gowda, laksh c.']")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(1000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//span[text()='abadi, aksh a.']")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(1000);
				oAlert.accept();
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//span[text()='tapase, shriya s.']")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(1000);
				oAlert.accept();

			}catch(Exception e)

			{
				e.printStackTrace();
			}
		}
		private static void ThirdtimeAdminlogout()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);

			}catch(Exception e)

			{
				e.printStackTrace();
			}
		}
		private static void CloseBrowser()
		{
			try
			{
				oBrowser.close();
				Thread.sleep(3000);


			}catch(Exception e)
			{
				e.printStackTrace();
			}

		}
		
}


