package nestedLoops;

import java.util.Scanner;

public class Pattern_10 {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of stars you want :- ");
int n=sc.nextInt();
int rows = 2 * n + 1;

for(int i = 1; i <= rows; i++) {
	if(i<= n) {
		for(int j = 1; j <= rows - n - i; j++) System.out.print("* ");
		for(int j = 1; j <= i + i; j++) System.out.print("  ");
		for(int j = 1; j <= rows - n - i; j++) System.out.print(" *");
		System.out.println();
		} else if(i > n && i == rows - n ) {
				System.out.println();
		} else if(i > n + 1 && i <= rows ) {
			for(int j = 1; j <= i - n - 1; j++) System.out.print("* ");
			for(int j = 1; j <= (rows - i + 1) * 2 ; j++) System.out.print("  ");
			for(int j = 1; j <= i - n - 1; j++) System.out.print(" *");
			System.out.println();
	}

}   
}
}
