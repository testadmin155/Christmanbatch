package FirstPackage;

public class SamsungS22 implements TROIInterface {

	public static void main(String[] args) {
		
		//Create an object to  call Methods
		SamsungS22 SS22 = new SamsungS22();
				SS22.Calling();
				SS22.Callend();
				SS22.Messges();
				SS22.CallDivert();
				SS22.CallWaiting();

	}

	@Override
	public void Calling() {
		System.out.println("call lift by scroll right");
		
	}

	@Override
	public void Callend() {
		System.out.println("call lift by scroll left");
		
	}

	@Override
	public void Messges() {
		System.out.println("Samsung S22 Messages");
		
	}

	@Override
	public void CallDivert() {
		System.out.println("Samsung S22 CallDivert");
		
	}

	@Override
	public void CallWaiting() {
		System.out.println("Samsung S22 allWaiting");
		
	}

	@Override
	public void phonelock() {
		System.out.println("Samsung S22 phonelock");
		
	}

}
