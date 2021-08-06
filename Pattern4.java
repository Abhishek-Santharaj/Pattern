public class Pattern4 {

	public static void main(String[] args) {
		int cap=5;
		for(int row=0;row<=4;row++){
		for(int space=1;space<=row;space++)
		{System.out.print("  ");}
		for(int col=1;col<=cap;col++)
		{
		System.out.print(col+" ");
		}
		System.out.println();
		cap--;
		}
		
	}

}
/*Output

1 2 3 4 5 
  1 2 3 4 
    1 2 3 
      1 2 
        1 

*/