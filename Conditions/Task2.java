package Conditions;

import java.util.Scanner;

public class Task2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your runs scored:");
		int runs = sc.nextInt();
		if(runs==0) {
			System.out.println("You scored Duck");
		}
		else if(runs>=50 && runs<99) {
			System.out.println("You scored Half Century");
		}
		else if(runs>=100 && runs<200) {
			System.out.println("You scored Century");
		}
		else if(runs>=200)
		{
			System.out.println("You scored Double Century");
		}
		else {
			System.out.println("You scored less than 50");
		}

	}

}
