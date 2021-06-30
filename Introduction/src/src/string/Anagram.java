package string;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean check=true;
		System.out.println("Enter a String : ");
		String a=sc.nextLine();
		System.out.println("Enter Another string : ");
		String b=sc.next();
		System.out.println("Checking if they are Anagrams _ _ _ _ _ _ _ _ _ _ _ .........");
		System.out.println();
		if(a.length()!=b.length())
		{
			check=false;
		}
		else {
	int array[]=new int[256];
	for(char c :a.toCharArray())
	{
		int index=(int) c;
		array[index]++;
	}
	for(char c :b.toCharArray())
	{
		int index=(int) c;
		array[index]--;
	}
	for(int i=0;i<256;i++)
	{
		if(array[i] != 0)
		{
			check=false;
		}
	}
		}
	if(check==true)
	{
		System.out.println("These are Anagrams");
	}
	else
	{
		System.out.println("These are not Anagrams");
	}
		
		
	}

}
