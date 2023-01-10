package FirstPackage;

public class MultiDimensionArray {

	public static void main(String[] args) {
		
		//2 4 5 7
		//3 4 7 8
		//1 2 6 9
		
		/*int nums [] = {2,4,5,7};
		System.out.println(nums[2]);*/
		
		
		//There are 3 Rows and 4 COlumns
		int nums [][] = {{2,4,5,7},{3,4,7,8},{1,2,6,9}};
		
		//System.out.println(nums[2][1]);
		
		int i=0;
		int j=0;
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(nums[i][j]);
				System.out.print(" ");
			}
			System.out.println("\t");
		}
		
		
		
		
		

	}

}
