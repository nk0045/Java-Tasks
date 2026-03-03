package Loops;

import java.util.Scanner;

public class Task6 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find its sum of digits:");
        int num = sc.nextInt();
        int sum=0;
        while(num>0)
        {
        	sum = sum + num%10;
        	num/=10;
        }
        System.out.println("The sum of digits is:"+sum);
	}

}
