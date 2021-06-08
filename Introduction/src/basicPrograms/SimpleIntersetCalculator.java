package basicPrograms;
import java.util.Scanner;

public class SimpleIntersetCalculator {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Priciple Amount");
int p=sc.nextInt();
System.out.println("Enter rate of interest ");
float r=sc.nextFloat();
System.out.println("Enter time period in years");
int t=sc.nextInt();
double i;
i=(p*r*t)/100;
System.out.println("Your Simple Interest is :-"+i);
	}

}
