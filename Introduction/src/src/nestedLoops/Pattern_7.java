package nestedLoops;
import java.util.Scanner;
public class Pattern_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows :- ");
		int n=sc.nextInt();
		System.out.println("*");
		for(int i=1;i<=n-2;i++)
		{
			System.out.print("*");
			for(int j=0;j<i-2;j++)
			{
			System.out.print(" ");
			}
			System.out.print("*");
		
		System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			System.out.print("*");
		}
		
	}

}
