package conditionalStatement;
import java.util.Scanner;

public class Ternary_Operator {
	public static void main(String[] args)
	{
		
	int max=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two Numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	max=a>b ? a: b;
	System.out.println("Maxmimum from this two number is "+max);
	
	

}
}