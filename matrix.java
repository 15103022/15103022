//1(b) Write a Java program to multiply two given matrices.

package matrix;
import java.util.Scanner;

public class Matrix {
	public static void main(String args[]){
		int m,n,p,q,x,y,z,sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Rows and Columns in First Matrix :");
		m = in.nextInt();
		n = in.nextInt();
		int first[][] = new int[m][n];
		System.out.println("Enter First Matrix element :");
		for(x=0;x<m;x++)
		{
			for(y=0;y<n;y++)
			{
				first[x][y] = in.nextInt();
			}
		}
		
		System.out.println("Enter the number of Rows and Columns in Second Matrix :");
		p = in.nextInt();
		q = in.nextInt();
		if ( n != p )
	      {
	         System.out.print("Matrix of the entered order can't be Multiplied..!!");
	      }
		else
		{
			int second[][] = new int[p][q];
			int multiply[][] = new int[m][q];
			System.out.println("Enter Second Matrix element :");
			for(x=0;x<p;x++)
			{
				for(y=0;y<q;y++)
				{
					second[p][q] = in.nextInt(); 
				}
			}
			System.out.println("Mutiplying both Matrix.......");
			for(x=0;x<m;x++)
			{
				for(y=0;y<q;y++)
				{
					for(z=0;z<p;z++)
					{
						sum=sum + first[x][z]* second[z][y];
					}
					multiply[x][y] = sum;
					sum=0;
				}
			}
			System.out.println("Matrix Multiplication Result is :");
			for(x=0;x<m;x++)
			{
				for(y=0;y<q;y++)
				{
					System.out.println(multiply[x][y] + "\t");
					System.out.println("\n");
				}
			}	
		}
	}
}
