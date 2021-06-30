package nestedLoops;
import java.util.Scanner;
public class MultipicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the maximum range of the multipication table starting from 1 :-");
int num=sc.nextInt();
for(int i=1;i<=num;i++)
{
	for(int j=1;j<=20;j++)
	{
		int ans=i*j;
		System.out.print("  "+ans);
	}
System.out.println();
}
	}

}
