package FirstScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Testing Session\\\\SeleniumTraining\\\\BrowserDrivers\\\\chromedriver_win32\\\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();
		
		//boolean ReturnDateField = driver.findElement(By.id("custom_date_picker_id_2")).isEnabled();
		//System.out.println(ReturnDateField);
		
		String returndatefielddisplay = driver.findElement(By.id("marketDate_2")).getAttribute("style");
		System.out.println(returndatefielddisplay);
		
		Assert.assertTrue(returndatefielddisplay.contains("0.5"));
		//Assert.assertFalse(returndatefielddisplay.contains("0.1"));*/
		 
		 int a = 10;
		 int b =20;
		 int actualvalue = a+b;
		 int expectedvalue = 30;
		 
		 Assert.assertEquals(actualvalue,expectedvalue);
		 System.out.println("Testing");
		 
		
		
		

	}

}
