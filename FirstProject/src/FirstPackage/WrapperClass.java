package FirstPackage;

public class WrapperClass {

	public static void main(String[] args) {
		
		//int		-	Interger
		//double	-   Double
		//char		-   Character
		//boolean 	-	Boolean
		
		String Mobile = "5000";
		String headset ="1000";
		
		int Mobileprice= Integer.parseInt(Mobile);
		int Headesetprice=Integer.parseInt(headset);
		
		int ActualAmount = Mobileprice+Headesetprice;
		System.out.println(ActualAmount);
		int Expected = 6000;
		
		System.out.println(ActualAmount==Expected);
		
		
		
		
		
		

	}

}
