/*1(a) Write a Java program that prompts the user for an integer and then prints out all prime numbers up to that integer.*/

package prime;
import java.util.Scanner; 

public class Prime {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int i=0,num=0;
		String primeNumbers = "";
		System.out.println("Enter the value of n :");
		int n=in.nextInt();
		in.close();
		for(i=0;i<n;i++)
		{
			int count = 0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
					count++;
			}
			if(count==2)
				primeNumbers = primeNumbers + i + " ";
		}
		System.out.println("Prime Numbers upto given Number are :");
		System.out.println(primeNumbers);
	}
}
