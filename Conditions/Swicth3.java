package Conditions;

import java.util.Scanner;

public class Swicth3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the required currency to display it's symbol");
		String str = sc.next();
	    switch(str)
	    {
	    case "USD":
	    	System.out.println("$");
	    	break;
	    case "INR":
	    	System.out.println("₹");
	    	break;
	    case "EUR":
	    	System.out.println("€");
	    	break;
	    }

	}

}
