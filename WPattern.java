public class WPattern {

	public static void main(String[] args) {
		int cap=7;int SecondSpace=0;
		for(int row=0;row<=3;row++){
	
		for(int space=1;space<=row;space++)
		{
			System.out.print("  ");
		}
		for(int col=1;col<=cap;col++)
		{
			if(col==1 || col==cap)
				System.out.print(" *");
			else
				System.out.print("  ");
		}
		if(row>=1)
			{	
				for(int space=1;space<=SecondSpace;space++)
				{System.out.print("  ");}
			}
		for(int col=1;col<=cap;col++)
		{
			if(col==1 || col==cap)
				System.out.print(" *");
			else
				System.out.print("  ");
		}
		
		System.out.println();cap-=2;SecondSpace+=2;
		}
		}
}

/* Output 

 *           * *           *
   *       *     *       *
     *   *         *   *
       *             *

*/