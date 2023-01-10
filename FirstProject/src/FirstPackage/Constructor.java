package FirstPackage;

public class Constructor {
	
	//Difference between Method and a Constructor
	//Method should have a return type, 
	//Constructor will not have a return type.
	//Constructor should always have same as class name
	//When ever an object is created, Constructor is executed automatically.
	
	public void Constructor1()
	{
		System.out.println("I am a Method");
	}
	
	public Constructor(int y, String x)
	{
		System.out.println("I am a int and string");
	}
	
	public Constructor()
	{
		System.out.println("I am a Constructor");
	}
	
	public Constructor(int x)
	{
		System.out.println("I am a int");
	}
	
	public Constructor(String x)
	{
		System.out.println("I am a string");
	}
	

	public static void main(String[] args) {
		
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor(10);
		

	}

}
