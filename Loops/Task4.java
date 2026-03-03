package Loops;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find it's factorial:");
		int num = sc.nextInt();
		int mul=1;
		for(int i=1;i<=num;i++)
		{
			mul=mul*i;
		}
		System.out.println("The factorial of the number is:"+mul);

	}

}
