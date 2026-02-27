package Conditions;

import java.util.Scanner;

public class Task4 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the city name:");
		String city = sc.next();
		if(city.equals("Chennai")) {
			System.out.println("The state is TAMILNADU");
		}
		else if(city.equals("Bengaluru"))
		{
			System.out.println("The state is KARNATAKA");
		}
		else if(city.equals("Mumbai"))
		{
			System.out.println("The state is MAHARASHTRA");
		}
		else
		{
			System.out.println("No state Available");
		}

	}

}
