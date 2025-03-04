package Twarita.cucumberFramework.utils;

import org.openqa.selenium.WebDriver;

public class GenericUtilityMethods {
	WebDriver driver;
	
	
	public GenericUtilityMethods(WebDriver driver) {
		this.driver = driver;		
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}

}
