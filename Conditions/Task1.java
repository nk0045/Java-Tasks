package Conditions;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your age:");
	    int age = sc.nextInt();
	    if(age>=18 && age<60)
	    {
	    	System.out.println("You are eligible to vote");
	    }
	    else if(age>=60)
	    {
	    	System.out.println("You are a senior citizen");
	    }
	    else
	    {
	    	System.out.println("You are not eligible");
	    }

	}

}
