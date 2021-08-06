public class Pattern1 {

	public static void main(String[] args) {
	for (int row = 1;row <=5; row++) {
				      
	for (int column = 5;column>=row; column--)
	{
				        
	System.out.print("  ");
   }
				      
				      
 for(int value = row; value>=1; value--) 
 {
				        
	 System.out.print(value + " ");
				          
}
				      
	System.out.println();
 }
				        
 System.out.println(" ");

	}

}

/*Output

          1 
        2 1 
      3 2 1 
    4 3 2 1 
  5 4 3 2 1 

*/