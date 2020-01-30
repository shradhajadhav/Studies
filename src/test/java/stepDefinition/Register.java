package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Register 
{
	public static WebDriver driver;
	
	@Given("^User open TestMeApp$")
	public void UseropenTestMeApp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println("Launch Successful");
	}
	
	@When("^User click signup$")
	public void Userclicksignup()
	{
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
		System.out.println("Page Load Successful");
	}
	 
	@And("^Enter user name as \"([^\"]*)\"$")
	public void Enterusername(String uname)
	{
		driver.findElement(By.name("userName")).sendKeys(uname);
	}
	
	@And("^Enter first name as \"([^\"]*)\"$")
	public void Enterfirstname(String fname)
	{
		driver.findElement(By.name("firstName")).sendKeys(fname);
	}
	
	@And("^Enter last name as \"([^\"]*)\"$")
	public void Enterlastname(String lname)
	{
		driver.findElement(By.name("lastName")).sendKeys(lname);
	}
	
	@And("^Enter password as \"([^\"]*)\"$")
	public void Enterpassword(String pwd)
	{
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@And("^Enter confirm password as \"([^\"]*)\"$")
	public void Enterconfirmpassword(String cpass)
	{
		driver.findElement(By.id("pass_confirmation")).sendKeys(cpass);
	}
	
	@And("^Enter select gender as \"([^\"]*)\"$")
	public void Enterselectgender(String gender)
	{
		if(gender.equalsIgnoreCase("male"))
			driver.findElement(By.xpath("//input[@value='Male']")).click();
		else if(gender.equalsIgnoreCase("female"))
			driver.findElement(By.xpath("//input[@value='Female']")).click();
	}
	
	@And("^Enter email as \"([^\"]*)\"$")
	public void Enteremail(String mail)
	{
		driver.findElement(By.name("emailAddress")).sendKeys(mail);
	}
	
	@And("^Enter mobile as \"([^\"]*)\"$")
	public void Entermobile(String phone)
	{
		driver.findElement(By.name("mobileNumber")).sendKeys(phone);
	}
	
	@And("^Enter dob as \"([^\"]*)\"$")
	public void Enterdob(String dob)
	{
		driver.findElement(By.name("dob")).sendKeys(dob);
	}
	
	@And("^Enter address as \"([^\"]*)\"$")
	public void Enteraddress(String add)
	{
		driver.findElement(By.name("address")).sendKeys(add);
	}
	
	@And("^Enter answer as \"([^\"]*)\"$")
	public void Enteranswer(String ans)
	{
		driver.findElement(By.name("answer")).sendKeys(ans);
	}
	
	@Then("^User click Register$")
	public void UserclickRegister()
	{
		driver.findElement(By.name("Submit")).click();
	}
	
	
	

}
