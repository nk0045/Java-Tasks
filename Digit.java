package jhyfgd;

public class Digit {

	public static void main(String[] args) {
		int a=56;
		int q=a/10;
		int m=a%10;
		if(q>m) {
			System.out.println(q+" is greater");
		}
		else if(m>q) {
			System.out.println(m+" is greater");
		}
		else {
			System.out.println("Both are equal");
		}
  
	}

}
