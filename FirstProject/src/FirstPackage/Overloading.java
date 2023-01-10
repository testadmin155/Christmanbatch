package FirstPackage;

public class Overloading {
	
	public void getdata(String username, String Password)
	{
		System.out.println("getdata with String Arguments"+ username + Password);
	}
	
	public void getdata(String username)
	{
		System.out.println("getdata with String Arguments"+ username);
	}
	
	public void getdata()
	{
		System.out.println("getdata without arguments");
	}
	
	public void getdata(int username, String Password)
	{
		System.out.println("getdata with int and string arguments"+ username + Password);
	}
	
	public void getdata(int username, int Password)
	{
		System.out.println("getdata with int arguments"+ username + Password);
	}
	
	

	public static void main(String[] args) {
		
		Overloading over = new Overloading();
		over.getdata(10, 20);
		over.getdata();
		over.getdata(30, "Testing");
		over.getdata("testing", "Automation");
		
	}

}
