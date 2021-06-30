package nestedLoops;
import java.util.Scanner;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of starts");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<n-i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}


	}

}
