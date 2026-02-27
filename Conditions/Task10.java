package Conditions;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of first side:");
		int a = sc.nextInt();
		System.out.println("Enter the length of second side:");
		int b = sc.nextInt();
		System.out.println("Enter the length of third side:");
		int c = sc.nextInt();
		if((a+b)>c && (b+c)>a && (c+a)>b )
		{
			if(a==b && b==c && a==c)
			{
				System.out.println("It is a Equilateral Traingle");
			}
			else if(a==b || a==c || b==c)
			{
				System.out.println("It is a Isoceles Triangle");
			}
			else
			{
				System.out.println("It is a Scalene Traingle");
			}
		}
		else
		{
			System.out.println("Invalid input for a traingle");
		}
		

	}

}
