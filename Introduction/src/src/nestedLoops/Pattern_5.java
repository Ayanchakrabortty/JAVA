package nestedLoops;

import java.util.Scanner;

public class Pattern_5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows you want :- ");
		int n=sc.nextInt();
		int p=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				++p;
			System.out.print(p+"  ");
		    }
			System.out.println();
		}
			
			
			}
		}

