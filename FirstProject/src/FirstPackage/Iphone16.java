package FirstPackage;

public class Iphone16 implements TROIInterface{

	//By using the keyword implements a class will access interface
	
	public static void main(String[] args) {
		
		//Create an object to  call Methods
		Iphone16 IP15 = new Iphone16();
		IP15.Calling();
		IP15.Callend();
		IP15.Messges();
		IP15.CallDivert();
		IP15.CallWaiting();
		IP15.AppStore();
		IP15.frontcam();
		IP15.rarecam();
		IP15.iWatch();
		IP15.facetime();

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
		System.out.println("128 MP");
	}

	public void rarecam() {
		System.out.println("256 MP");
	}
	
	public void chip() {
		System.out.println("iconicPremium");
	}
}
