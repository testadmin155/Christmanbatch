package FirstPackage;

public class MethodParameter {
	
	//Class will accept only implemented methods
	
	public void Login(String username, String password)
	{
		System.out.println("Enter Email as "+ username);
		System.out.println("Enter Password as "+ password);
		System.out.println("Click on login button");
	}
	
	public static void main(String[] args) {
		
		MethodParameter  login = new MethodParameter();
		//Classname objectname = new classname
		
		login.Login("Sravanthi","test1234");
		login.Login("Sadam","test@1234");
		login.Login("Anusha","pass@777'");
		login.Login("Poonguzhali","testing0987");


	}


}
