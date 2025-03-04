package Twarita.cucumberFramework.pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectsManager {
	WebDriver driver;
	public LandingPageObject landingPage;
	
	
	public PageObjectsManager(WebDriver driver) {
		this.driver = driver;
	}
	
	 
	
	public LandingPageObject getLandingPage() {
		landingPage = new LandingPageObject(driver);
		return landingPage;
	}
	
	
	

}
