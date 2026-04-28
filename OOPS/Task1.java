package OOPS;

class Student {
    int id;
    String name;
    double marks;
    
    Student(int id, String name, double marks) 
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    
    void display() 
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }
}

public class Task1 
{
	public static void main(String[] args) 
	{
        Student s1 = new Student(1, "Nandhu", 85.5);
        Student s2 = new Student(2, "Arun", 90.0);
        s1.display();
        s2.display();
    }

}
