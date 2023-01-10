package FirstScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {

	public static void main(String[] args) {
		
		//Script to Execute the code in Chrome
				System.setProperty("webdriver.chrome.driver", "E:\\\\Testing Session\\\\SeleniumTraining\\\\BrowserDrivers\\\\chromedriver_win32\\\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://book.spicejet.com/");
				driver.manage().window().maximize();
				
				 int countcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
				 System.out.println(countcheckbox);
				 
				 //script to select an option
				 
			/*	 System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Student")).isSelected());
				 driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Student")).click();
				 System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Student")).isSelected());
				 
				 */
				String dicountvalue =  "Armed Forces";
				 List<WebElement>  discounts = driver.findElements(By.xpath("//div[@id='divdiscountcheckbox']/div/div/p"));
				 
				 for (WebElement singleoption : discounts )
				 {
					 System.out.println(singleoption.getText());
					 if (singleoption.getText().equals(dicountvalue))
					 {
						 switch (dicountvalue)
								 {
							 case "Family & Friends":
								 driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();
								 break;
								 
							 case "Sr. Citizen":
								 driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen")).click();
								 break;
								 
							 case "Armed Forces":
								 driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense")).click();
								 break;
								 
							 case "LTC Fare":
								 driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_LTCFare")).click();
								 break; 
								 
								 
								 }
						 break;
					 }
				 }

	}

}
