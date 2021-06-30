package loops;
import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {

Scanner sc= new Scanner(System.in);
//sum of 1+1/2+1/3.........1/n
System.out.println("Enter how many times you want to calculate the series");
int n=sc.nextInt();
float sum=0;
for(float i=1;i<=n;i++)
{
	sum+=1/i;
}
System.out.println("The sum of the series is = "+sum);
	}

}
