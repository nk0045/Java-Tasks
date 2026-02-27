package Conditions;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary:");
		int sal = sc.nextInt();
		System.out.println("Enter your experience in years");
		int exp = sc.nextInt();
        if(sal>30000 && exp>5)
        {
        	System.out.println("You are eligible for Bonus");
        }
        else
        {
        	System.out.println("You are not eligible for Bonus");
        }
	}

}
