package Arrays;

public class Task2 {

	public static void main(String[] args) 
	{
		int a[] = {64,63,99,125,69};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
		}
		
	}


