package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mytest {
	WebDriver driver;
	@Given("^Checking example$")
	public void startup()
	{
		System.setProperty("webdriver.chrome.driver", "K:\\Softwares\\chromedriver_win32\\chromedriver.exe"
				+ "");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@When("^User opend the browser$")
	public void getString()
	{
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	}
	@Then("^User see the google$")
	public void waiting() throws Exception
	{
		Thread.sleep(5000);
	}
	@And("^User close the application$")
	public void Closing()
	{
		driver.close();
	}
}
