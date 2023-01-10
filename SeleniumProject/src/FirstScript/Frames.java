package FirstScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//switch to Frame
		//driver.switchTo().frame("singleframe");
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.name("SingleFrame")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Testing");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		

	}

}
