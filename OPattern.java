public class OPattern {

	public static void main(String[] args) {
		for(int col=1;col<=6;col++)
		{
		System.out.print("* ");
		}
		System.out.println();
		for(int col=1;col<=6;col++)
		{
			if(col!=6)
			{
				System.out.print("* ");
				for(int space=1;space<=4;space++)
				{
					System.out.print("  ");
				}
				System.out.println("*");
			}else {
				for(int star=1;star<=6;star++)
					System.out.print("* ");
				  }
		 }
}
}

/*Output 

* * * * * * 
*         *
*         *
*         *
*         *
*         *
* * * * * * 


*/