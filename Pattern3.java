public class Pattern3 {

	public static void main(String[] args) {
		int cap=1;
		for(int row=1;row<=5;row++) 
		{
		for(int col=row;col<=5;col++)
		{		
		System.out.print(" ");
		}
		for(int col=row;col<=cap;col++)
		{
		System.out.print(col+ " ");
		}
		System.out.println();cap+=2;
		}
		
	}

}
/*Output
  
     1 
    2 3 
   3 4 5 
  4 5 6 7 
 5 6 7 8 9 


*/