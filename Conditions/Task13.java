package Conditions;

import java.util.Scanner;

public class Task13 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check prime or not:");
        int num = sc.nextInt();
        int n=0;
        if(num>1)
        {
        	for(int i=1;i<=num;i++)
        	{
        		if(num%i == 0)
        		{
        			n++;
        		}
        	}
        }
        
        if(n==2) {
        	System.out.println("It is prime");
        }
        else
        {
        	System.out.println("It is not prime");
        }
	}

}
