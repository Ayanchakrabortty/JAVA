package whileLoop;
import java.util.Scanner;


public class SumOfDigits {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:- ");
	int num=sc.nextInt();
	int sum=0;
	int r=0;
	int temp=num;
	
	
while(num>0)
{
r=num%10;
num=num/10;
sum=sum+r;
}
System.out.println("The sum of the digit "+temp+" is  " +sum);
	}

}
