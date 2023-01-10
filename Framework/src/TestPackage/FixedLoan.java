package TestPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class FixedLoan {
	
	@Test
	public void FixedLoanWebLogin()
	{
		System.out.println("FixedLoanWebLogin");
	}
	
	@Test
	public void FixedLoanWeballvalid()
	{
		System.out.println("FixedLoanWeballvalid");
	}
	
	@Test
	public void FixedLoanWebvaliduser()
	{
		System.out.println("FixedLoanWebvaliduser");
	}
	
	@Test
	public void FixedLoanWebinvaliduser()
	{
		System.out.println("FixedLoanWebinvaliduser");
	}
	
	@Test(dependsOnMethods = {"FixedLoanBranchLogin"})
	public void FixedLoanWebblank()
	{
		System.out.println("FixedLoanWebblank");
	}
	
	@Test
	public void FixedLoanWebblankall()
	{
		System.out.println("FixedLoanWebblankall");
	}
	
	
	@Test
	public void FixedLoanWebinvalidpassword()
	{
		System.out.println("FixedLoanWebinvalidpassword");
	}
	
	
	@Test
	public void FixedLoanAPPLoginvalid()
	{
		System.out.println("FixedLoanAPPLoginvalid");
	}
	
	@Test
	public void FixedLoanAPPLogininvalid()
	{
		System.out.println("FixedLoanAPPLogininvalid");
	}
	
	@Test
	public void FixedLoanAPPLoginblank()
	{
		System.out.println("FixedLoanAPPLoginblank");
	}
	@Test
	public void FixedLoanBranchLogin()
	{
		System.out.println("FixedLoanBranchLogin");
	}

}
