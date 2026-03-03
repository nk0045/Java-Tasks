package Loops;

import java.util.Scanner;

public class Task11 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number");
		int num = sc.nextInt();
		String str = "";
		while(num>0)
		{
			int rem = num%2;
			str = rem + str;
			num/=2;
		}
		System.out.println(str);
		

	}

}
