package FirstPackage;

public class Class2 {

	public static void main(String[] args) {
		
		Class1 class1 = new Class1();
		System.out.println(class1.x);
		System.out.println(class1.y);
		//System.out.println(class1.name);
		System.out.println(class1.z);
		class1.defaultMethod();
		class1.privateMethod();
		class1.protectedMethod();
		class1.publicMethod();

	}

}
