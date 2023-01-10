package FirstPackage;

public class Parentclass extends GrandParent{
	
	public void Money()
	{
		System.out.println("Has Money");
	}
	
	public void Bike()
	{
		System.out.println("Has Bike Hero");
	}
	
	public void job ()
	{
		System.out.println("Has Job");
	}
	
	public void time()
	{
		System.out.println("Has no time");
	}

	
	public static void main(String[] args) {
		
		Parentclass parent = new Parentclass();
		parent.Money();
		parent.Bike();
		parent.job();
		parent.time();
		parent.Villa();
		
	}

}
