package sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in an Array : ");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter elements one by one : ");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Before sortings elements are : ");
	for(int e: a)
	{
		System.out.print(e+ " | ");
	}
	System.out.println();
	for(int i=0;i<n-1;i++)
	{
		int minIndex=i;
		for(int j=i;j<n;j++)
		{
			if (a[j]<a[minIndex])
			{
			minIndex=j;
			}
		}
		int temp=a[i];
		a[i]=a[minIndex];
		a[minIndex]=temp;
		
	}
	System.out.println("After Selection Sorting elements are : ");
	
	for(int e: a)
	{
		System.out.print(e+ " | ");
	}
	}

}
