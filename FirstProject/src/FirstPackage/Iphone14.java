package FirstPackage;

public class Iphone14 implements TROIInterface{

	//By using the keyword implements a class will access interface
	
	public static void main(String[] args) {
		
		//Create an object to  call Methods
		Iphone14 IP14 = new Iphone14();
		IP14.Calling();
		IP14.Callend();
		IP14.Messges();
		IP14.CallDivert();
		IP14.CallWaiting();
		IP14.AppStore();
		IP14.frontcam();
		IP14.rarecam();
		IP14.iWatch();
		IP14.facetime();

	}

	@Override
	public void Calling() {
		System.out.println("Sroll up to lift the call");
		
	}

	@Override
	public void Callend() {
		System.out.println("Sroll down to lift the call");
		
	}

	@Override
	public void Messges() {
		System.out.println("iphone14 messages");
		
	}

	@Override
	public void CallDivert() {
		System.out.println("iphone14 CallDivert");
		
	}

	@Override
	public void CallWaiting() {
		System.out.println("iphone14 allWaiting");
		
	}

	@Override
	public void phonelock() {
		System.out.println("Iphone14 Lock");
		
	}
	
	public void facetime()
	{
		System.out.println("Facetime Iphone14");
	}
	
	public void AppStore()
	{
		System.out.println("AppStore Iphone14");
	}
	
	public void iWatch()
	{
		System.out.println("iWatch Iphone14");
	}
	
	public void frontcam() {
		System.out.println("32 MP");
	}

	public void rarecam() {
		System.out.println("64 MP");
	}
	
	public void chip() {
		System.out.println("iconicbasic");
	}
}
