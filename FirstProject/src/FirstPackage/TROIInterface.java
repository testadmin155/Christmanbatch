package FirstPackage;

public interface TROIInterface {
	
	//Class contains Methods and Variable
	// what Interface contains? - it contains only unimplemented Methods 
	
	
	//Calling
	//Callend
	//Messges
	//CallDivert
	//CallWaiting
	
	//implemented Method - with Body / with implementation
	/*public void Calling1()
	{
		System.out.println("Press green button");
	}*/
	
	//Interface contains only unimplemented Methods, it means no body
	//Who is going to implement this - 
	//whoever is going to use this interface will implement the body
	
	//Unimplemented Method
	//- No Body - Noimplementation
	
	public void Calling(); 
	public void Callend();
	public void Messges();
	public void CallDivert();
	public void CallWaiting();
	public void phonelock();
	
	
	

}
