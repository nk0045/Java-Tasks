package Conditions;

import java.util.Scanner;

public class Task17 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount:");
		int amount = sc.nextInt();
		if(amount>1000)
		{
			System.out.println("You are premium member");
		}
		else
		{
			System.out.println("You are not a premium member");
		}
     }

}
