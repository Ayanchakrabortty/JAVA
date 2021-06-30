package loops;
import java.util.Scanner;

public class Palindrome {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check wheather it is palindrome or not :- ");
int input=sc.nextInt();
int temp=input;
int sum=0;
int r;
while (input!=0)
{ r=input%10;
sum=(sum*10)+r;
input=input/10;
}
if(temp==sum)
	System.out.println("The number is palindrome");
else
	System.out.println("The number is not palindrome");


}
}
