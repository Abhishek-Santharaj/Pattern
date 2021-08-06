public class Pattern5 {

	public static void main(String[] args) {
		int no=1;
		for(int row=3;row>=1;row--)
		{
		for(int col=1;col<=row;col++)
		{
		System.out.print(no+" ");
		no++;
		}
		System.out.println();
		}
		
	}

}

/* Output

1 2 3 
4 5 
6 



*/