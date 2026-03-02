package Conditions;

import java.util.Scanner;

public class Task20 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it's cube or not");
		int a = sc.nextInt();
		while(a%3==0)
		{
			a=a/3;
		}
		if(a==1)
		{
			System.out.println("It is cube");
		}
		else
		{
			System.out.println("It is not cube");
		}

	}

}
