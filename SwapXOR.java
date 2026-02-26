package jhyfgd;

public class SwapXOR {

	public static void main(String[] args) 
	{
		int a=40;
		int b=50;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a = "+a);
	    System.out.println("b = "+b);
     }

}
