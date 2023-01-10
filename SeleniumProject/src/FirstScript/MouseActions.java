package FirstScript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class MouseActions {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//There is a class implemented by Selenium - Actions
		Actions mouse = new Actions(driver);
		/*mouse.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).perform();
		driver.findElement(By.xpath("//span[text()='Your Prime Video']")).click();
		System.out.println(driver.getTitle());
		*/
		
		//Script to Right CLick
		/*mouse.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).perform();
		mouse.moveToElement(driver.findElement(By.xpath("//span[text()='Your Prime Video']"))).contextClick().perform();
		*/
		
		//Script to enter capital letter
		//mouse.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("television").perform();
		

		//script to double click
		mouse.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("electronics").doubleClick().perform();
		
		
		//Screenshot
		//File screeshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		/*File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshot, new File("E:\\Testing Session\\SeleniumTraining\\Fifth Batch\\screen1.png"));
		*/
		Files.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("E:\\Testing Session\\SeleniumTraining\\Fifth Batch\\screen1.png"));
		
		driver.close();
	}

}
