package loops;
import java.util.Scanner;

public class BasicForLoops {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The number of times you want to print a word ");
	int n=sc.nextInt();
	
	System.out.println("Enter the word you want to print");
	sc.nextLine();
	String s=sc.nextLine();
	for(int i=0;i<n;i++)
	{
		System.out.print("\t"+s);
	}
	

	}

}
