package oops;
class books{

 books(String name , int price ,String author)
	{
	System.out.println("The name of the book is "+name);
		System.out.println("Price is "+price);
	System.out.println("Name of the author "+author);
	}
}
public class ConstructorBasics {
	public static void main(String[] args)
	{
		books  a=new books("Investonomy",480,"Pranjal Kamra");
		books b=new books ("Dear Stranger I know How you feel",249,"Asish Bagrecha");
	
	}
}
	 


