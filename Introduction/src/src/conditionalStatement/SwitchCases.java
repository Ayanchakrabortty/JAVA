package conditionalStatement;
import java.util.Scanner;
public class SwitchCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the day of the week");
		int day=sc.nextInt();
		switch(day)
		{
		case 1:
			System.out.println("I am on leave , Happy weekend !");
			break;
		case 2:
			System.out.println("Ahha ! The first day of office ");
			break;
		case 3:
			System.out.println("Second day of office with lots of tasks !!!");
			break;
		case 4:
			System.out.println("Half of the tasks are completed ! littile relief");
			break;
		case 5:
			System.out.println("All tasks done , it's time for presentation ");
			break;
		case 6:
			System.out.println("Opps Booring Meetings today ");
			break;
		case 7:
			System.out.println("Oh yeah ! Finally half day ... Weekend fun started ");
			break;
			default:
				System.out.println("Oh no ! You entered an invalid input ");
				
			
		}
		

	}

}
