package loops;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number for what you want to calculate its factorial");
int n=sc.nextInt();
long factorial=1;
for(int i=n;i>=1;i--)
{
	factorial*=i;
	
}
System.out.println("Your factorial is "+factorial);
	}

}
