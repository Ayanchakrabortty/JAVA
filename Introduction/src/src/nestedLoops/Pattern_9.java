package nestedLoops;

import java.util.Scanner;

public class Pattern_9 {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of maximum stars :- ");
int n=sc.nextInt();
int row=2*n-1;
for(int i=1;i<=(2*n)-1;i++)
{
	if(i<=n)
	{
	for(int j=0;j<n-i+1;j++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	}
	else
	{
		for(int j=0;j<=i-n;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=row-i+1;j++)
		{
			System.out.print("*");
		}
	
	}
	System.out.println();
}

	}

}
