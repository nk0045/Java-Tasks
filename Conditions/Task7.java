package Conditions;

import java.util.Scanner;

public class Task7 
{

	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a 3 digit number:");
	    int num = sc.nextInt();
	    if(num>=100 && num<=999)
	    {
	    	int fd = num/100;
	    	int ld = num%10;
	    	if(fd == ld)
	    	{
	    		System.out.println("It is a palindrome");
	    	}
	    	else
	    	{
	    		System.out.println("It is not a palindrome");
	    	}
	    }
	    else
	    {
	    	System.out.println("Invalid number");
	    }

	}

}
