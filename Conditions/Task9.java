package Conditions;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character:");
		char a = sc.next().charAt(0);
		if((a>='a' && a<='z') || (a>='A' && a<='Z'))
		{
			if(a>='a' && a<='z')
			{
				System.out.println("Entered input is a character and also lowercase");
			}
			else if(a>='A' && a<='Z')
			{
				System.out.println("Entered input is a character and also Uppercase");
			}
		}
		else {
			System.out.println("Invalid Input");
		}
			

	}

}
