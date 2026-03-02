package Conditions;

import java.util.Scanner;

public class Task18 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it's power of 2:");
		int num = sc.nextInt();
		while(num%2==0)
		{
			num=num/2;
		}
		if(num==1)
		{
			System.out.println("It is power of 2");
		}
		else
		{
			System.out.println("It is not power of 2");
		}

	}

}
