package Loops;

import java.util.Scanner;

public class Task7 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse it:");
		int num = sc.nextInt();
		String a = "";
		while(num>0)
		{
			a =a+(num%10);
			num/=10;
		}
		System.out.println(a);
	}

}
