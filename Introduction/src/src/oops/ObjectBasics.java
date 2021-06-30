package oops;
class Car
{
int wheels;
String modelName ;
String color;

}

public class ObjectBasics {
	

	public static void main(String[] args) {
		
Car suzuki=new Car();
suzuki.wheels=4;
suzuki.modelName="Kawasiki 100";
suzuki.color="Yellow";
System.out.println("Number of wheels of the car suzuki is "+suzuki.wheels+" Model name "+suzuki.modelName+ " color "+suzuki.color);

	}

}

