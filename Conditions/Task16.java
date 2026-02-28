package Conditions;

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is divisible by 2 and 4");
		int a = sc.nextInt();
		if(a%2==0)
		{
			if(a%4==0)
			{
				System.out.println("It is divisible by both 2 and 4");
			}
			else
			{
				System.out.println("It is divisible by 2 only");
			}
		}
		else
		{
			System.out.println("It is not divisible by both 2 and 4");
		}

	}

}
