package FirstScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Testing Session\\\\SeleniumTraining\\\\BrowserDrivers\\\\chromedriver_win32\\\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();

		int countcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(countcheckbox);

		
		String discountvalue =  "Family & Friends";
		List<WebElement>  discounts = driver.findElements(By.xpath("//div[@id='divdiscountcheckbox']/div/div/p"));
		
		for (WebElement singleoption : discounts )
		{
			String singlevalue=singleoption.getText();
			
			if (singlevalue.equals(discountvalue))
				{
					singleoption.click();
					System.out.println(singleoption.getText());
					
				}
		}

	}

}
