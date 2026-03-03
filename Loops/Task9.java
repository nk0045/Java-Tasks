package Loops;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for it's fibonacci series:");
		int num = sc.nextInt();
		int sum=0;
		int f=0, s=1;
		for(int i=0;i<num;i++)
		{
			 System.out.println(f);
             int next = f+s;
             f=s;
             s=next;
		}

	}

}
