public class Pattern7 {

	public static void main(String[] args) {
		int cap=7;
		for(int row=0;row<=3;row++){
	
		for(int space=1;space<=row;space++)
		{
			System.out.print("  ");
		}
		for(int col=1;col<=cap;col++)
		{
			if(col==1 || col==cap)
				System.out.print(" 1");
			else
				System.out.print("  ");
		}
		System.out.println();cap-=2;
		}
		int scap=3;
		for(int row=3;row>=1;row--){
			
			for(int space=1;space<=row-1;space++)
			{
				System.out.print("  ");
			}
			for(int col=1;col<=scap;col++)
			{
				if(col==1 || col==scap)
					System.out.print(" 1");
				else
					System.out.print("  ");
			}
			System.out.println();scap+=2;
			}
		}

	}


