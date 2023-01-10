package FirstPackage;

public class Class1 {
	
	public int x = 10; // public variable
	int y =20;  // default variable
	protected int z = 15; //protected variable
	private String name = "Anees"; //private variable
	
	public void publicMethod()
	{
		System.out.println("Public Method");
	}
	
	void defaultMethod ()
	{
		System.out.println("default Method");
	}

	private void privateMethod()
	{
		System.out.println("private Method");
	}
	
	
	protected void protectedMethod()
	{
		System.out.println("protected Method");
	}
	
	
	public static void main(String[] args) {
		
		Class1 class1 = new Class1();
		System.out.println(class1.x);
		System.out.println(class1.y);
		System.out.println(class1.name);
		System.out.println(class1.z);
		class1.defaultMethod();
		class1.privateMethod();
		class1.protectedMethod();
		class1.publicMethod();
		
		
		
	}

}
