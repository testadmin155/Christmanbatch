package FirstPackage;

public class nestedForLoop {

	public static void main(String[] args) {
		
		/*
		//1 2 3 4 5
		//6 7 8 9
		//10 11 12
		//13 14
		//15
		
		//Rows are outer loop
		//Column are inner loop
		
		int k=1;
		for(int Row=0;Row<5;Row++)
		{
			for(int Column=0;Column<5-Row;Column++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
			
		} */
		
		
		
		//1
		//2 3
		//4 5 6
		//7 8 9 10
		
		//Outloops are 4
		//innerloop are 4
		int k=1;
		for(int row=1;row<=4;row++)
		{
			for (int column=1;column<=row;column++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
		
		
		//1
		//1 2
		//1 2 3
		//1 2 3 4
		
		
	}

}
