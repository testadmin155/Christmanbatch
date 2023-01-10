package FirstScript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		//Script to perform action on new tab
		
		/*driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parent = it.next();
		System.out.println(parent);
		String child = it.next();
		System.out.println(child);
		
		driver.switchTo().window(child);
		String message = driver.findElement(By.xpath("//div[@class='text-center']/h1")).getText();
		System.out.println(message);
		
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//ul[contains(@class,'nav-stacked')]/li[2]")).click();
		
		driver.quit();
		
		//driver.close();
		//driver.quit();
		
		*/
		
		//Script to perform action on new window
		driver.findElement(By.xpath("//ul[contains(@class,'nav-stacked')]/li[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parent = it.next();
		System.out.println(parent);
		String child = it.next();
		System.out.println(child);
		
		driver.switchTo().window(child);
		String message = driver.findElement(By.xpath("//div[@class='text-center']/h1")).getText();
		System.out.println(message);
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(parent);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//ul[contains(@class,'nav-stacked')]/li[1]")).click();
	
		//driver.quit();
		
	}

}
