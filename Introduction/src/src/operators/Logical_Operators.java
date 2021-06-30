package operators;
import java.util.Scanner;

public class Logical_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
a=sc.nextInt();
if(a>=0 && a<= 100)
{
	System.out.println("This number is lies between the range 0-100");
}
else
{
	System.out.println("The number is not lies between the range 0-100");
}
		
	}

}
