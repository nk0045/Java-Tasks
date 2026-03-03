package Loops;

import java.util.Scanner;

public class Task5 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string to reverse it:");
		String str = sc.nextLine();
		String a = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			a = a+str.charAt(i);
		}
		System.out.println("The reversed String is:"+a);
    }

}
