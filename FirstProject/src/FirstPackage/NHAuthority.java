package FirstPackage;

public abstract class NHAuthority {

	public void Greenlight()
	{
		System.out.println("Go");
	}
	
	public void Orangelight()
	{
		System.out.println("wait");
	}
	
	public void Redlight()
	{
		System.out.println("Stop");
	}
	
	
	public abstract void Greenlighttime();
	
	public abstract void Orangelighttime() ;
	
	public abstract void Redlighttime();

	public static void main(String[] args) {
		
		
		
	}

}
