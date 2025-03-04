package Twarita.cucumberFramework.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public WebDriver driver;

	public WebDriver getDriver() throws Exception {
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Global.properties");
		Properties property = new Properties();
		property.load(file);
		String browserProperty = property.getProperty("browser");
		String url = property.getProperty("url");
		
		String browser = System.getProperty("browser")!=null ? System.getProperty("browser") : browserProperty;

		if (driver == null) {
			if (browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}
			driver.get(url);

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		}

		return driver;

	}

}
