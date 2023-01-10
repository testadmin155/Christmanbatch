package FirstPackage;

public class Methods {

	//Whenever we feel some set of lines of code can be reused multiple times, 
	//then we will place that code in a Method and reuse the method
	
	//Methods of a class can be access via creating an object of that class
	
	//How to create a Method
	public void admin_Login()
	{
		System.out.println("Enter user name as Sravanthi");
		System.out.println("Enter Password as test1234");
		System.out.println("Click on login button");
	}
	
	public void employee_login()
	{
		System.out.println("Enter user name as Sadam");
		System.out.println("Enter Password as test@1234");
		System.out.println("Click on login button");
	}
	
	public void customer_login() 
	{
		System.out.println("Enter user name as Anusha");
		System.out.println("Enter Password as pass@777");
		System.out.println("Click on login button");
	}
	
	public void ceo_login()
	{
		System.out.println("Enter user name as Poonguzhali");
		System.out.println("Enter Password as testing0987");
		System.out.println("Click on login button");
	}
	
	public static void main(String[] args) {
		
		//How to create an object
		Methods obj = new Methods();
		obj.admin_Login();
		obj.ceo_login();
		obj.customer_login();
		obj.employee_login();
			
		
		/*
		// login with admin user
		System.out.println("Enter user name as Sravanthi");
		System.out.println("Enter Password as test1234");
		System.out.println("Click on login button");
		
		//login with employee user
		System.out.println("Enter user name as Sadam");
		System.out.println("Enter Password as test@1234");
		System.out.println("Click on login button");
		
		
		//login with customer 
		System.out.println("Enter user name as Anusha");
		System.out.println("Enter Password as pass@777");
		System.out.println("Click on login button");
		
		//login with CEO
		System.out.println("Enter user name as Poonguzhali");
		System.out.println("Enter Password as testing0987");
		System.out.println("Click on login button");
		 */
		
		
	}

}
