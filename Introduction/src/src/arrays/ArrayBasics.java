package arrays;
import java.util.Scanner;
public class ArrayBasics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total Number of students :- ");
		int n=sc.nextInt();
		float marks[]=new float[n];
		float avg=0;
		System.out.println("Enter their marks one by one :- ");
for(int i=0;i<n;i++)
{
	marks[i]=sc.nextFloat();
	
}
for(int i=0;i<n;i++)
{
	avg=avg+marks[i];
	
}
float ans=avg/n;
System.out.println("The avarge of total numbers is = "+ans);

	}

}
