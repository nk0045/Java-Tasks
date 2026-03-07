package Arrays;

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int rows = a.length;
		int cols = a[0].length;
		int b[][] = new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		System.out.println("The Transpose of a matrix is:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

	}

}
