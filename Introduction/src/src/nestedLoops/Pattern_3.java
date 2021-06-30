package nestedLoops;

import java.util.Scanner;

public class Pattern_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of starts");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<i-1;j++)
			{
				System.out.print(" ");
			}
				for(int j=1;j<n-i+1;j++)
				{
					System.out.print("* ");
				}
			
			System.out.println();
		}

	}

}
