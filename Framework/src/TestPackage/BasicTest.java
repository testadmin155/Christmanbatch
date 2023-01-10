package TestPackage;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTest {

	@Test //Annotation
	public void Demo()
	{
		//System.out.println("hello");
		Assert.assertTrue(false);
		System.out.println("Testing");
	}
	
	@Test
	public void getData()
	{
		//System.out.println("Testing");
		Assert.assertTrue(false);
		System.out.println("Testing1234");
	}
	
	@Test
	public void newyear() 
	{
		System.out.println("Happy New Year");
	}
}

