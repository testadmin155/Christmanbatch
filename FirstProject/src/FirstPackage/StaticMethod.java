package FirstPackage;

public class StaticMethod {
	
	//Static Methods can be called in the same class without creating object
	//we can call in other class of same package by creating obj of that Static method class
	//We cannot call the static methods in other package
	
	static void method1() 
	{
		System.out.println("this is a static Method");
	}

	public static void main(String[] args) {
		//Static Methods can be called without creating Objects
		method1();

	}

}
