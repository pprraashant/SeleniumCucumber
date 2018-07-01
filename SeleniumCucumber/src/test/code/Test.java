package test.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {
	
	WebDriver driver;
	
	@Given("^on I am on HomePage$")
	public void on_I_am_on_HomePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String workingDir = System.getProperty("user.dir");
		//Users/prashantpawar/Documents/Development/Selenium/ChromeDriver
		//System.setProperty("webdriver.chrome.driver", workingDir+"/exe/ChromeDriver");
		System.setProperty("webdriver.chrome.driver","/Users/prashantpawar/Documents/Development/Selenium/ChromeDriver");
		driver=new ChromeDriver();
		driver.get("http://www.crossword.in");
	    //throw new PendingException();
	}

	@When("^I search for Product$")
	public void i_search_for_Product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.id("search-input")).sendKeys("Cricket");
		Thread.sleep(4000);
		driver.findElement(By.id("//*[@id='search']/span[3]/input")).click();
		Thread.sleep(4000);
	   // throw new PendingException();
	}

	@When("^I click on low to high$")
	public void i_click_on_low_to_high() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.id("//*[@id='search-results']/div[2]/div[3]/span[2]/a[2]")).click();
		//*[@id='search-results']/div[2]/div[3]/span[2]/a[2]
	    //throw new PendingException();
	}

	@Then("^Search results must be sorted$")
	public void search_results_must_be_sorted() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.id("//*[@id='search-result-items']/li[1]/div/div[2]/span[3]/span[3]/span")).getText();
		
	    throw new PendingException();
	}


	
}