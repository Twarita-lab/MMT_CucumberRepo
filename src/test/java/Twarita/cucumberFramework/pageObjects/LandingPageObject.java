package Twarita.cucumberFramework.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageObject {
	WebDriver driver;
	private WebElement tripElement;
	private WebElement selectedCity;
	
	
	public LandingPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	private By closeLoginPopuup = By.cssSelector("[data-cy='closeModal']");
	private By searchList = By.cssSelector("p[class*='searchedResult'] span");
	
	
	private WebElement gettripElement(String tripType) {
		tripElement = driver.findElement(By.cssSelector("li[data-cy*='"+tripType+"']"));
		return tripElement;
	}
	
	private WebElement getSelectedCityElement(String typeOfPlace) {
		selectedCity = driver.findElement(By.cssSelector("input#" + typeOfPlace + "City"));
		return selectedCity;
	}
	
	private void getCityListWithSearchText(String typeOfPlace, String city) {
		typeOfPlace = typeOfPlace.replace(typeOfPlace.substring(0, 1), typeOfPlace.substring(0, 1).toUpperCase());
		driver.findElement(By.cssSelector("input[placeholder='"+typeOfPlace+"']")).sendKeys(city);
			}
	
	
	public void closePopup() {
		driver.findElement(closeLoginPopuup).click();
	}

	public void selectModeOfTransport(String transportMode) {
		// TODO Auto-generated method stub
		WebElement headerIcons = driver.findElement(By.cssSelector("a.headerIcons"));
		
		WebElement headerMenu = headerIcons.findElement(By.cssSelector(" span[class*="+transportMode+"]"));
		if(headerMenu.getDomAttribute("class").contains("inactive")) headerMenu.click();

	}

	public void selectTypeOfTrip(String tripType) {
		tripType = tripType.replaceAll("\\s", "");
		tripType = tripType.replaceAll(tripType.substring(0, 1),tripType.substring(0, 1).toLowerCase());
		
		tripElement = gettripElement(tripType);
		
		if(!tripElement.isSelected()) tripElement.click();

	}

	public void selectCity(String typeOfPlace, String city) {
		
		typeOfPlace = typeOfPlace.replace("\"", "").toLowerCase();
		selectedCity = getSelectedCityElement(typeOfPlace);
		if (!selectedCity.getDomAttribute("value").equalsIgnoreCase(city)) {
			selectedCity.click();
			getCityListWithSearchText(typeOfPlace, city);
			List<WebElement> cityList = driver.findElements(searchList);
			
			for (WebElement cityInput : cityList) {
				if (cityInput.getText().equalsIgnoreCase(city)) {
					cityInput.click();
					break;
				}
			}

		}
		
	}

}
