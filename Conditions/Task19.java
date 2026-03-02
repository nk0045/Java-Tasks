package Conditions;

import java.util.Scanner;

public class Task19 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password:");
		String a = sc.next();
		if(a.equals("admin@123"))
		{
			System.out.println("You have successfully logged in!!");
		}
		else
		{
			System.out.println("The password is incorrect");
		}

	}

}
