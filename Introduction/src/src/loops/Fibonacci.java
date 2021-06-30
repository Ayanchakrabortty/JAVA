package loops;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of the fibonaci series");
int n=sc.nextInt();
int a=0;
int b=1;
int c;
System.out.println("Your fibonacci series is :- ");
System.out.print(a+"\t");
System.out.print(b+"\t");
for(int i=0;i<n-2;i++)
{
c=a+b;
System.out.print(c+"\t");
a=b;
b=c;
}
	}

}
