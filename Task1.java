package jhyfgd;
import java.util.*;
public class Task1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		a/=100;
		int c = a%10;
		System.out.println("The middle digit of the number is = "+c);
		System.out.println("The square of Middle digit = "+(c*c));
     }

}
