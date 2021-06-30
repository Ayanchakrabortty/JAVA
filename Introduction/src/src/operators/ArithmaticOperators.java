package operators;
import java.util.Scanner;

public class ArithmaticOperators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second Number");
		int b=sc.nextInt();
		int addition=a+b;
		int substraction=a-b;
		int devision=a/b;
		int modulous=a%b;
		int multipication=a*b;
		System.out.println("Addition of this two number is "+addition);
		System.out.println("Substraction of this two number is "+substraction);
		System.out.println("After devicion quotient is  "+devision);
//		System.out.println("Addition of this two number is "+addition);
		System.out.println("After devision remainder is  "+modulous);
		System.out.println("Multipication of this two number is "+multipication);

}
}