package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.googlebase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googleHome;


public class googlesearchSteps extends googlebase {
	
	
	googleHome gh;
	
	//WebDriver  driver;
	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
	    
		launchBrowser ();
		
	 /* WebDriverManager.chromedriver().setup();
	   
	   driver = new ChromeDriver();
	   
	  
	 driver.get("https://www.google.com/");
	 
	 driver.manage().window().maximize();*/
	 
	 
		   
	}

	@When("I enter search {string}")
public void i_enter_search(String string) {
		
		gh = new googleHome(driver);
		
		searchBx
		
	
		
		
	 /* WebElement searchBx;
	  
		searchBx = driver.findElement(By.name("q"));
		
		searchBx.sendKeys(string);*/
		
	  
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		
		gh.clickBtn();
		
		/*WebElement searchBtn;
		
		searchBtn = driver.findElement(By.className("gNO89b"));
		
		searchBtn.click();*/
		

	}

	@Then("i receive related search result")
	public void i_receive_related_search_result() {
	  
	   WebElement resultStats;
	   
	   resultStats = driver.findElement(By.id("result-stats"));
	   
	   String results = resultStats.getText();
	   
	   System.out.println("===============");
	   
	   System.out.println(results);
	   
	   System.out.println("===============");
	    
	   
	   
	  // driver.close();
	   closeBrowser();
	}

	
	
	
	
	
	
	
	

}
