package FirstScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ReturnDateEnabledorDisabled {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Testing Session\\\\SeleniumTraining\\\\BrowserDrivers\\\\chromedriver_win32\\\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();
		
		//boolean ReturnDateField = driver.findElement(By.id("custom_date_picker_id_2")).isEnabled();
		//System.out.println(ReturnDateField);
		
		String returndatefielddisplay = driver.findElement(By.id("marketDate_2")).getAttribute("style");
		System.out.println(returndatefielddisplay);
		
		
		if (returndatefielddisplay.contains("1"))
		{
			System.out.println("Return Date field looks like Enabled");
		}
		else
		{
			System.out.println("Return Date field looks like disabled");
		}
		
		

	}

}
