/*2(a) Write a Java program that checks whether a given string is a palindrome or not. Ex: MADAM is a palindrome*/

package prime;
import java.util.Scanner;

public class Pallindrome {
	public static void main(String args[]){
		int num,rem,org,rev=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = in.nextInt();
		org = num;
		while(num!=0)
		{
			rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		
		if(rev==org)
			System.out.println("This is a Pallindrome Number ");
		else
			System.out.println("This is not a Pallindrome Number ");
	}
}
