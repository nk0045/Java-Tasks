package Conditions;

import java.util.Scanner;

public class Task5 
{

	public static void main(String[] args) 
	{
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the day:");
	      String day = sc.next();
	      if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday"))
	      {
	    	  System.out.println("Weekday");
	      }
	      else if(day.equals("Saturday") || day.equals("Sunday"))
	      {
	    	  System.out.println("Weekend");
	      }

	}

}
