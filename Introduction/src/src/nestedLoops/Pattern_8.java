package nestedLoops;
import java.util.Scanner;

public class Pattern_8 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows you want :- ");
int n=sc.nextInt();

	
for(int i=1;i<=n;i++)
{
for(int j=0;j<i;j++)
{
	System.out.print("     ");
}
for(int j=0;j<n-i+1;j++)
{
System.out.print(" *");
}
System.out.println();
}
	}

}
