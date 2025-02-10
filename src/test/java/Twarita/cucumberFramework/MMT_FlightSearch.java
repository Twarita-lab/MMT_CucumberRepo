package Twarita.cucumberFramework;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MMT_FlightSearch {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		Wait<WebDriver> explicitWait = new WebDriverWait(driver, Duration.ofSeconds(3));

		// Closing pop-up menu
		driver.findElement(By.cssSelector("span.commonModal__close")).click();

		// Clicking on desired type of menu
		String menuToBeSelected = "Flight";
		driver.findElement(By.xpath(
				"//span[text()[contains(.,'" + menuToBeSelected + "')]]/parent::a[contains(@class,'headerIcons')]"))
				.click();

		// Type of trip selection for Flights
		String tripType = "Round Trip";
		driver.findElements(By.cssSelector("div.flightWidgetSection li[data-cy*='Trip']")).stream()
				.filter(a -> a.getText().equalsIgnoreCase(tripType))
				.forEach(a -> a.findElement(By.cssSelector(" span")).click());

		// open from dropdown
		String searchedFromPlace = "IXB";
		driver.findElement(By.cssSelector("label[for='fromCity']")).click();

		// Search with keyword
		driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys(searchedFromPlace);

		// Select 1 Airport based on Airport code
		driver.findElement(By.xpath("//*[contains(text(),'IXB')]")).click();

		// open to dropdown
		String searchedToPlace = "CCU";
		driver.findElement(By.cssSelector("label[for='toCity']")).click();

		// Search with keyword
		driver.findElement(By.cssSelector("input[placeholder='To']")).sendKeys(searchedToPlace);

		// Select 1 Airport based on Airport code
		driver.findElement(By.xpath("//*[contains(text(),'"+searchedToPlace+"')]")).click();
		
		WebElement calendarPane = driver.findElement(By.cssSelector(".DayPicker.Selectable"));
		
		Date d = new Date();
		String[] date = d.toString().split(" ");
				
		if(calendarPane.isDisplayed()) {
			List<WebElement> displayedMonths = calendarPane.findElements(By.cssSelector(" [role='heading'] div"));
			Assert.assertTrue(displayedMonths.get(0).getText().contains(date[1]));
			
			List<WebElement> displayedYear = displayedMonths.get(0).findElements(By.cssSelector(" span"));
			Assert.assertTrue(displayedYear.get(0).getText().contains(date[date.length-1]));
			
		}
		
		String Month = "February";
		String year = "2025";
		
		

		driver.quit();
	}

}
