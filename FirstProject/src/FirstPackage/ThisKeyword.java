package FirstPackage;

public class ThisKeyword {
	
	int y = 10; // global variable or instance variable

	public void getdata()
	{
		int y = 20; // local variable
		System.out.println(y);
		System.out.println("gloabl variable "+this.y);
	}
	
	public void getData1()
	{
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
		
		ThisKeyword obj = new ThisKeyword();
		obj.getdata();	//20
		obj.getData1(); //10
	}

}
