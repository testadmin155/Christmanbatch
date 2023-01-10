package TestPackage;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class FlexiLoan {
	
	@Test(groups= {"regression"})
	public void FlexiLoanWebLogin()
	{
		System.out.println("FlexiLoan from WEB");
	}
	
	@Test
	public void FlexiLoanAPPLogin()
	{
		System.out.println("FlexiLoan from APP");
	}
	
	@Test(groups= {"regression"})
	public void FlexiLoanBranchLogin()
	{
		System.out.println("FlexiLoan from Branch");
	}

}
