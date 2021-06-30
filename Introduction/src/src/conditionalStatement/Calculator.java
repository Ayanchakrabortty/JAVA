package conditionalStatement;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First number");
		float a=sc.nextFloat();
		System.out.println("Enter Second number");
		float b=sc.nextFloat();
		System.out.println("Enter what operation you want to do =>   +  -   /   *    %");
		sc.nextLine();
		char operation=sc.nextLine().charAt(0);
		float result=0f;
		switch(operation)
		{
		case '+' :
			result=a+b;
			break;
		case '-' :
			result=a-b;
			break;
		case '*' :
			result=a*b;
			break;
		case '/' :
			result=a/b;
			break;
		case '%' :
			result=a%b;
			break;
			default :
				System.out.println("Invalid Input !!");
			
		}
		System.out.println("Result is =>  "+result);
	}

}
