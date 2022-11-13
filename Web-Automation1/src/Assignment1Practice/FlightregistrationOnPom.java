package Assignment1Practice;
//mercury registration demo webpage 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightregistrationOnPom {

	WebDriver driver;
	By RegLInk= By.linkText("REGISTER");

	By firstname=By.name("firstName");
	By lastname=By.name("lastName");
	By phone=By.name("phone");
	By Email=By.name("userName");
	By adress1=By.name("address1");
	
	By city=By.name("city");
	By state=By.name("state");
	By postalcode=By.name("postalCode");
	By country=By.name("country");
	By username=By.name("email");
	By password=By.name("password");
	By confirpassword=By.name("confirmPassword");
	By registerbtn=By.name("submit");
	
	FlightregistrationOnPom(WebDriver d)
	{
		//this.driver=driver;
		driver=d;
	}
	public void clickregLink()
	{
		driver.findElement(RegLInk).click();
	}
	public void setFirstName(String fname)
	{
		driver.findElement(firstname).sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		driver.findElement(lastname).sendKeys(lname);
	}
	public void setPhonename(String ph)
	{
		driver.findElement(phone).sendKeys(ph);
		
	}
	public void setEmail(String mail)
	{
		driver.findElement(Email).sendKeys(mail);
		
	}
	public void setcity(String city1)
	{
		driver.findElement(city).sendKeys(city1);		
	}
	public void setState(String stat)
	{
		driver.findElement(state).sendKeys(stat);		
	}
	public void setpostalcode(String pscode)
	{
		driver.findElement(postalcode).sendKeys(pscode);		
	}
	public void setcontry(String contry)
	{
		driver.findElement(country).sendKeys(contry);		
	}
	public void setuser(String user)
	{
		driver.findElement(username).sendKeys(user);		
	}
	public void setpass(String pass)
	{
		driver.findElement(password).sendKeys(pass);		
	}
	public void setconpass(String conpass)
	{
		driver.findElement(confirpassword).sendKeys(conpass);		
	}
	
	public void setregbutton()
	{
		driver.findElement(registerbtn).click();;		
	}
	
	
	
}
