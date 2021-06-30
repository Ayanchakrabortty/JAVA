package encapsulation;
import java.util.Scanner;

public class EncapsulationBasics {
	public static void main(String[] args)
	{
		Student s1=new Student();
		String name;
		int age;
		int studentClass;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name , age and class of a student : ");
		
		s1.setName(name=sc.nextLine());
		s1.setAge(age=sc.nextInt());
		s1.setStudentClass(studentClass=sc.nextInt());
		System.out.println("Student name is "+s1.getName());
		System.out.println("Student age is "+s1.getAge());
		System.out.println("Student's class is "+s1.getStudentClass());
	}

}
