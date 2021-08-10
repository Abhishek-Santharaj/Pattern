
import java.util.Scanner;
public class PascalTriangle {

	public static void main(String[] args) {
		
		
		      Scanner sc = new Scanner(System.in);
		      int num = 0;
		      System.out.print("Enter Number of Rows:: ");
		      num = sc.nextInt();
		      displayPascalTriangle(num);
		      sc.close();
		   }

		   private static void displayPascalTriangle(int n) {
		   
		      int a = 0;
		      
		      for(int i=1; i <= n; i++) {
		         a = 1;

		         for(int j = 1; j <= i; j++) 
		         {
		            System.out.print(a + " ");
		            a = a * (i-j) / j;
		            
		         }
		         System.out.println();
		      }
		   }
		

	}


