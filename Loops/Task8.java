package Loops;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find it's palindrome:");
		int num = sc.nextInt();
		int n=num;
		String a = "";
		while(num>0)
		{
			a =a+(num%10);
			num/=10;
		}
		int dum = Integer.parseInt(a);
		if(n==dum)
		{
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
     }

}
