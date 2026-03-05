package Arrays;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search:");
		int search = sc.nextInt();
		int index= -1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				index=i;
			}
		}
		if(index == -1)
		{
			System.out.println("Not found");
		}
		else
		{
			System.out.println("Target is at "+index+"th index");
		}

	}

}
