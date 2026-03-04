package Conditions;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check weekday or weekend");
		int num = sc.nextInt();
		switch(num)
		{
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("It is weekday");
			break;
		case 6:
		case 7:
			System.out.println("It is weekend");
			break;
		default:
			System.out.println("Invalid number");
		}

	}

}
