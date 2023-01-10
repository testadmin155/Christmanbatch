package FirstPackage;

public class ExceptionHandlings {

	//https://www.javatpoint.com/exception-handling-in-java#:~:text=The%20Exception%20Handling%20in%20Java,between%20checked%20and%20unchecked%20exceptions.
	
	public static void main(String[] args) {
		
		try {
			//Arrayout of bound exception
			int [] x = new int [5];
			System.out.println("automation");
			x[6]=50;
			
			//Nullpointer Exception
			/*String s=null;  
			System.out.println(s.length());*/
			
			//Arithmatic Exception
			/*int a =7;
			int b=0;
			int c=a/b;*/
			
		}
		catch (ArithmeticException e)
		{
			System.out.println("i am in Arithmatic catch");
			System.out.println(e);
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("i am in Array outofbound catch");
			System.out.println(e);
		}
		
		
		finally
		{
			System.out.println("clear browser cache");
			System.out.println("close the browser");
		}
		
		System.out.println("testing");
		System.out.println("training");
	}

}
