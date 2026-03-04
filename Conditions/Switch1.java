package Conditions;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter between 1 and 3:");
		int a = sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("You have selected Balance");
			break;
		case 2:
			System.out.println("You have selected Deposit");
			break;
		case 3:
			System.out.println("You have selected Withdraw");
			break;
		default:
			System.out.println("Invalid Number");
		}

	}

}
