package Conditions;

import java.util.Scanner;

public class Task15 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char a = sc.next().charAt(0);
		if(a>='0' && a<='9')
		{
			int h = (int)a;
			if(h%2 == 0)
			{
				System.out.println("It is even");
			}
			else
			{
				System.out.println("It is odd");
			}
		}

	}

}
