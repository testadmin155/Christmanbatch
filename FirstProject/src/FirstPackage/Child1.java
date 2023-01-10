package FirstPackage;

public class Child1 extends Parentclass{
	
	public void job()
	{
		System.out.println("No job");
	}
	
	public void Bike()
	{
		System.out.println("Has Bike BMW");
	}
	
	public void Time()
	{
		System.out.println("Has lot of time");
	}
	
	public void friends() {
		System.out.println("So many friends");
	}
	
	public void Money()
	{
		System.out.println("Less money");
	}
	
	public static void main(String[] args) {
		Child1 child1 = new Child1();
		child1.Bike();  //has bike BMW
		child1.friends(); // so many friends
		child1.job(); // no job
		child1.Money(); // has Money
		child1.Time(); // lot of time
		child1.Villa();

	}

}
