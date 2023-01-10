package Package2;

import FirstPackage.Class1;

public class Class3 extends Class1{

	public static void main(String[] args) {
		
		Class3 Class3 = new Class3();
		
		System.out.println(Class3.x);
		//System.out.println(class1.y);
		//System.out.println(class1.name);
		System.out.println(Class3.z);
		//class1.defaultMethod();
		//class1.privateMethod();
		Class3.protectedMethod();
		Class3.publicMethod();

	}

}
