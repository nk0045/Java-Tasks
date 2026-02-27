package Conditions;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks = sc.nextInt();
		if(marks>=35)
		{
			if(marks>=35 && marks<=50)
			{
				System.out.println("You got C grade!");
			}
			else if(marks>50 && marks<=75)
			{
				System.out.println("You got B grade!");
			}
			else if(marks>75 && marks<90)
			{
				System.out.println("You got A grade!");
			}
			else if(marks>=90 && marks<=100)
			{
				System.out.println("You got O grade!");
			}
		}
		else
		{
			System.out.println("Sorry!! You failed");
		}

	}

}
