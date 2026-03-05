package Arrays;

import java.util.Scanner;

public class Task10 {

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
		int b[] = new int[size];
		int bi=0;
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			}
			if(c==0)
			{
				b[bi]=a[i];
				bi++;
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(b[i]+" ");
		}

	}

}
