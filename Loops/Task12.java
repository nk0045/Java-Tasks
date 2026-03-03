package Loops;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check perfect or not:");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1;i<=(num/2);i++)
		{
			if(num%i == 0)
			{
				sum = sum + i;
			}
		}
		if(sum==num)
		{
			System.out.println("It is perfect number");
		}
		else
		{
			System.out.println("It is not perfect number");
		}


	}

}
