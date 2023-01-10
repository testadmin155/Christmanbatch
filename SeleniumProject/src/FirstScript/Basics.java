package FirstScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Basics {
	static WebDriver driver;
	
	public void login(String username, String Password)
	{
		driver.findElement(By.cssSelector("#login1")).sendKeys(username);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Password);
		driver.findElement(By.name("proceed")).click();
		
		String Actualmessage=driver.findElement(By.xpath("//div[@id='div_login_error']")).getText();
		System.out.println(Actualmessage);
		String Expectedmessage = "Wrong username and password combination.";
		System.out.println(Actualmessage.equals(Expectedmessage));
		driver.findElement(By.cssSelector("#login1")).clear();
		driver.findElement(By.cssSelector("input[type='password']")).clear();
		//driver.close();
	}

	public static void main(String[] args) {
	
		//Script to Execute the code in Chrome
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		//Script to Execute the code in Firefox
		//System.setProperty("webdriver.gecko.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
		//Script to Execute the code in IE
		//System.setProperty("webdriver.ie.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		//Script to click on SIgnin link
		//driver.findElement(By.id("login2")).sendKeys("Anees");
		//driver.findElement(By.name("passwd1")).sendKeys("Test1234");
		//X-path
		//driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Testing");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("saritha");  
		
		//CssSelector
		/*driver.findElement(By.cssSelector("#login1")).sendKeys("Testing12");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Password123434");
		driver.findElement(By.name("proceed")).click();
		
		String Actualmessage=driver.findElement(By.xpath("//div[@id='div_login_error']")).getText();
		System.out.println(Actualmessage);
		String Expectedmessage = "Wrong username and password combination.";
		System.out.println(Actualmessage.equals(Expectedmessage));
		driver.close();
		*/
		
		
		Basics obj = new Basics();
		obj.login("Anees", "Password");
		obj.login("Saritha123", "Test1234");
		obj.login("poo", "test");
		obj.login("suhaib", "efhsrtgndfg");
		
		
		
		

	}

}
