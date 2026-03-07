package Arrays;

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[][] = {{1,2,3},{4,5,6}};
		int rows = a.length;
		for(int i=0;i<rows;i++)
		{
			if(rows==0 || a[i].length!=rows)
			{
				System.out.println("Not a square matrix");
				break;
			}
			else
			{
				System.out.println("It is a square matrix");
			}
		}
		

	}

}
