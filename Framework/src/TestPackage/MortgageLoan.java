package TestPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class MortgageLoan {
	
	@Test(groups= {"sanity"})
	public void MortgageLoanWebLogin()
	{
		System.out.println("MortgageLoan from WEB");
	}
	
	@Test
	public void MortgageLoanAPPLogin()
	{
		System.out.println("MortgageLoan from APP");
	}
	
	@Test(groups= {"sanity"})
	public void MortgageLoanBranchLogin()
	{
		System.out.println("MortgageLoan from Branch");
	}

}
