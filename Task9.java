package NestedLoops;

public class Task9 {

	public static void main(String[] args) 
	{
		int rows=6;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows;j++)
			{
				if(i==1 || i==rows)
				{
				     System.out.print("*");	
				}
				else 
				{
				     System.out.print("*");
				     for(int k=1;k<=(rows-2);k++)
				     {
				    	 System.out.print(" ");
				     }
				     System.out.print("*");
				     break;
				}
			}
			System.out.println();
		}

	}

}
