package FirstScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecialDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.airindia.in");
		driver.manage().window().maximize();
		
		//script to select origin
		String fromplace="Guwahati, Lokpriya Gopinath Bordoloi International Airport, GAU, India, IN";
		//String toPlace="Hamburg, Hamburg Airport, HAM, Germany, DE";
		
		driver.findElement(By.id("from")).sendKeys("ah");
		Thread.sleep(2000);
		List<WebElement> fromoptions = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for (WebElement place:fromoptions)
		{
			System.out.println(place.getText());
			if(place.getText().equals(fromplace))
			{
				place.click();
				break;
			}
			
		}
		
		/*driver.findElement(By.id("to")).sendKeys("de");
		Thread.sleep(2000);
		List<WebElement> Tooptions = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for (WebElement destination:Tooptions)
		{
			System.out.println(destination.getText());
			if(destination.getText().equals(toPlace))
			{
				destination.click();
				break;
			}
			
		}*/
		
		

	}

}
