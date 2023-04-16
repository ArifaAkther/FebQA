package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleHome{
	WebDriver driver;
	
	public googleHome(WebDriver driver) {
		
		this.driver = driver ;
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="q")
	
	WebElement searchBx;
	
	public void enterSearch(String Bx ) {
		
		searchBx.sendKeys(Bx);
	}
	@FindBy(name="btnk")
	
	WebElement searchBtn;
	
	public void clickBtn() {
		searchBtn.click();
	}
	
	
	
}
