/*2(b) Write a Java program for sorting a given list of names in ascending order.*/

package prime;

import java.util.Scanner;

public class Sort {
	public static void main(String args[]){
		int n,i,j;
		String temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of Names you want to enter :");
		n=in.nextInt();
		String names[] = new String[n];
		Scanner n1 = new Scanner(System.in);
		System.out.println("Enter all the names :");
		for(i=0;i<n;i++)
		{
			names[i] = n1.nextLine();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		System.out.println("Names in sorted ascending order are :");
		for(i=0;i<n;i++)
		{
			System.out.println(names[i]);
		}
	}
}
