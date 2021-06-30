package conditionalStatement;
import java.util.Scanner;
public class Basic_Love_Finder {
	public static void main(String[] args)
	{
		int input;
		System.out.println("Enter the amount of peetals");
		Scanner sc= new Scanner(System.in);
		input=sc.nextInt();
		if(input%2==0)
		{
			System.out.println("She doesn't love you");
		}
		else
		{
			System.out.println("She loves you");
		}
		
	}

}
