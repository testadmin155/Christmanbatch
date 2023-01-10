package FirstPackage;

public class ComparisionOperators {

	public static void main(String[] args) {
		
		/* int x = 100;
		int y = 200;
		int z = x+y; 
		
		int x,y,z;
		x = 100;
		y=200;
		z=x+y; 
		*/
		
		/*int x = 120;
		int y =120;
		// == - Equals, 
		//!= - Not Equals, 
		// > - Greater than, 
		// < - Less than, 
		// >= - Greater than equals to , 
		// <= - Less than equals to
		
		System.out.println(x==y); //T
		System.out.println(x!=y); //F
		System.out.println(x>y); //F
		System.out.println(x<y); //F
		System.out.println(x>=y); //T
		System.out.println(x<=y); //T
   */
		
		String ExpectedResult = "Registration Succesfull";
		String ActualResult = "Registation Succesfull";
		//System.out.println(ActualResult.equals("Registration Succesfull"));
		//System.out.println(ActualResult.equals(ExpectedResult));
		if (ActualResult.equals(ExpectedResult))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
