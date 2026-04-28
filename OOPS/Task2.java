package OOPS;

class Rectangle{
	int length;
	int breadth;
	Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	void area()
	{
		System.out.println(length*breadth);
	}
}

public class Task2 {

	public static void main(String[] args) 
	{
		Rectangle rec = new Rectangle(10,20);
		System.out.print("The area of the rectangle is:");
		rec.area();
		

	}

}
