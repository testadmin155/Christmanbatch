package TestPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class CarBuy extends TestAnnotations{
	
	@Test(groups= {"sanity"})
	public void CarBuyWebLogin()
	{
		System.out.println("CarBuy from WEB");
	}
	
	@Test(groups= {"regression"})
	public void CarBuyAPPLogin()
	{
		System.out.println("CarBuy from APP");
	}
	
	@Test(groups= {"fullfeature"})
	public void CarBuyBranchLogin()
	{
		System.out.println("CarBuy from Branch");
	}

}
