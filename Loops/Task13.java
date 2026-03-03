package Loops;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) 
	{
		
		while(true)
		{
			int a=(int)Math.round((Math.random()*10));
			if(a!=7)
			{
				System.out.println(a);
			}
			else
			{
				break;
			}
		}

	}

}
