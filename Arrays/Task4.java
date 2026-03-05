package Arrays;

import java.util.Scanner;

public class Task4 {

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
		int ec = 0;
		int oc = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				ec++;
			}
			else
			{
				oc++;
			}
	    }
		System.out.println("The Even count is:"+ec);
		System.out.println("the Odd count is:"+oc);
	}

}
