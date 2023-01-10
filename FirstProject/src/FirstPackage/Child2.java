package FirstPackage;

public class Child2 extends Parentclass{

	public void Bike()
	{
		super.Bike();
		System.out.println("has bike Honda");
	}
	
	public void method1()
	{
		super.Bike();
	}
	
	public static void main(String[] args) {
		Child2 child2 = new Child2();
		
		child2.method1();
		//child2.job();
		//child2.Money();
		//child2.time();
	}

}
