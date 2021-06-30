package multidimensionArrays;

import java.util.Scanner;

public class MatrixMultipication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of ROWS and COLUMNS of First Array:- ");
		 int rows1=sc.nextInt();
	     int cols1=sc.nextInt();
	     int a[][]=new int[rows1][cols1];
	     System.out.println("Enter the elements of first Array : ");
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols1;j++)
			{
			a[i][j]=sc.nextInt();			
			}
		}
		System.out.println("Enter the number of ROWS and COLUMNS of Second Array:- ");
	int rows2=sc.nextInt();
	int cols2=sc.nextInt();
	int b[][]=new int[rows2][cols2];
	System.out.println("Enter the elements of Second Array : ");
	for(int i=0;i<rows2;i++)
	{
		for(int j=0;j<cols2;j++)
		{
		b[i][j]=sc.nextInt();			
		}
	}
	int c[][]=new int[rows1][cols2];
	if(rows1==cols2)
	{
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols2;j++)
			{
			for(int k=0;k<cols1;k++)
			{
				c[i][j]+=(a[i][k]*b[k][j]);
			}
			}
		}
		System.out.println("The Result Matrix is ");
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<cols2;j++)
			{
			System.out.print(c[i][j]+"|");			
			}
			System.out.println();
		}
		
	}
	else
	{
		System.out.println("Matrix Multipication is not possible for this Arrays : Error rows!=cols : ");
	}
	
	}

}
