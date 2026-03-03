package Loops;

import java.util.Scanner;

public class Task10 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for Armstrong number:");
		int a = sc.nextInt();
		int n=a;
		String str = String.valueOf(a);
		int len = str.length();
		int sum=0;
		while(a>0)
		{
			int rem = a%10;
			sum += Math.pow(rem, len);
			a/=10;
		}
		if(sum == n)
		{
			System.out.println("It is Armstrong number");
		}
		else
		{
			System.out.println("It is not an Armstrong number");
		}

	}

}
