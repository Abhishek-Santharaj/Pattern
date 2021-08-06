public class Pattern5 {

	public static void main(String[] args) {
		int no=1,cap=3;
		for(int row=1;row<=3;row++)
		{
		for(int col=1;col<=cap;col++)
		{
		System.out.print(no+" ");
		no++;
		}
		System.out.println();cap--;
		}
		
	}

}

/* Output

1 2 3 
4 5 
6 



*/