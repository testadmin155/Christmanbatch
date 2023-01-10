package FirstPackage;

public class IfConditionandSwitch {

	public static void main(String[] args) {
		
		//If and Else condition
		/*String ExpectedResult = "Registration Succesfull";
		String ActualResult = "Registation Succesfull";
		//System.out.println(ActualResult.equals("Registration Succesfull"));
		//System.out.println(ActualResult.equals(ExpectedResult));
		if (ActualResult.equals(ExpectedResult))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}*/
		
		
		//If condition
		/*String[] studentsnames = {"Arthi","Sommera","Poo","Saritha","Akshatha","Priya"};
		System.out.println(studentsnames.length);
		//Akshatha
		for(String name:studentsnames)
		{
			if(name=="Anees")
			{
				System.out.println(name);
				break;
			}
			
		}*/
		
		
		//If and else IF Condition
		//Put a Breakpoint(Double click on the line number) where you want to pause the script
		// Press F6 button to execute manually step by step
		/*String name="Priya";
		if (name=="Arthi")
		{
			System.out.println("Take to Arthi");
		}
		else if(name=="Sommera")
		{
			System.out.println("Take to Sommera");
		}
		else if(name=="Poo")
		{
			System.out.println("Take to Poo");
		}
		else if(name=="Saritha")
		{
			System.out.println("Take to Saritha");
		}
		else if(name=="Akshatha")
		{
			System.out.println("Take to Akshatha");
		}
		else if(name=="Priya")
		{
			System.out.println("Take to Priya");
		}
		else
		{
			System.out.println("No name is matched");
		}*/
		
		
		//Switch
		String name="Suhaib";
		switch (name) {
		case "Arthi":
		{
			System.out.println("Take to Arthi");
			break;
		}
		case "Sommera":
		{
			System.out.println("Take to Sommera");
			break;
		}
		case "Poo":
		{
			System.out.println("Take to Poo");
			break;
		}
		case "Saritha":
		{
			System.out.println("Take to Saritha");
			break;
		}
		case "Akshatha":
		{
			System.out.println("Take to Akshatha");
			break;
		}
		case "Priya":
		{
			System.out.println("Take to Priya");
			break;
		}
		default:
		{
			System.out.println("No name is matched");
		}
		
		}
		
			
		
	}
}
