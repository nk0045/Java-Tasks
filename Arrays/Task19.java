package Arrays;

import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int rows = sc.nextInt();
		System.out.println("Enter no of cols:");
		int cols = sc.nextInt();
		if(rows!=cols)
		{
			System.out.println("Addition cannot be done");
		}
		else
		{
			int a[][] = new int[rows][cols];
			int b[][] = new int[rows][cols];
			System.out.println("Enter 1st matrix:");
			for(int i=0;i<rows;i++)
			{
				System.out.println("Enter "+i+"th row:");
				for(int j=0;j<cols;j++)
				{
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter 2nd matrix:");
			for(int i=0;i<rows;i++)
			{
				System.out.println("Enter "+i+"th row:");
				for(int j=0;j<cols;j++)
				{
					b[i][j] = sc.nextInt();
				}
			}
			
			int c[][] = new int[rows][cols];
			System.out.println("The addition of matrix is:");
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					c[i][j] = a[i][j]+b[i][j];
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
			
			
		}
		

	}

}
