package conditionalStatement;
import java.util.Scanner;
public class Nested_if {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 3 Numbers ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int result;
		if(a>b)
		{
			if(a>c)
			{
				result=a;
			}
			else
			{
				result=c;
				
			}
		}
		else
		{
			if(b>c)
			{
				result=b;
			}
		else
		{
			result=c;
		}
		
	 }
		System.out.println("The largest number is " +result);
	}

}
