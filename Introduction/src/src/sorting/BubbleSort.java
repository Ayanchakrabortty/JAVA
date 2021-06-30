package sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in a array: ");
int n=sc.nextInt();
int a[]=new int[n];
boolean sorted =true;
System.out.println("Enter elements one by one :- ");
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
	}
System.out.println("Before Sorting elements are :- ");
for(int i=0;i<n;i++)
{
	System.out.print(a[i]+" | ");
}
System.out.println();
for(int i=0;i<n-1;i++)
{
	for(int j=0;j<n-1-i;j++)
	{
	
	if(a[j+1]>a[j])
	{
		int temp=a[j+1];
		a[j+1]=a[j];
		a[j]=temp;
		sorted=false;
	}
	if(sorted) break;
	}
}
System.out.println("After bubble sorting in decreasing order elements are : ");
for(int i=0;i<n;i++)
{
	System.out.print(a[i]+" | ");
}
}

}
