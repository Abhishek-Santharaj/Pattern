public class Pattern2 {

	public static void main(String[] args) {
		
		for(int row=1;row<=5;row++) 
		{
		for(int col=row;col<=5;col++)
		{		
		System.out.print(" ");
		}
		for(int col=1;col<=row;col++)
		{
		System.out.print(col + " ");
		}
		System.out.println();
		}
		

	}

}


/*  Output
     1 
    1 2 
   1 2 3 
  1 2 3 4 
 1 2 3 4 5 
 
 */