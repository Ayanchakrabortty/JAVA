package conditionalStatement;
import java.util.Scanner;

public class IfElseBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your age");
age=sc.nextInt();
if(age>=18)
{
	System.out.println("You are eligible to vote");
	
}
else
{
	System.out.println("You are not elogible to vote");
}
	}

}
