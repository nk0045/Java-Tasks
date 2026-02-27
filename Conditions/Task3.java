package Conditions;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks scored:");
		int marks = sc.nextInt();
		System.out.println("Enter your attendance percentage:");
		int per = sc.nextInt();
		if(marks>=50 && per>=75)
		{
			System.out.println("You are eligible to attend the exam");
		}
		else
		{
			System.out.println("You are not eligible to attend the exam");
		}

	}

}
