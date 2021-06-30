package encapsulation;

public class Student {
	private String name;
	private int age;
	private int studentClass;
	
	


public String getName()
{
	return name;
}

public int getStudentClass() {
	return studentClass;
}

public void setStudentClass(int studentClass) {
	this.studentClass = studentClass;
}

public void setAge(int age) {
	this.age = age;
}

public int getAge()
{
	return age;
}
public void setName(String name)
{
	this.name=name;
}
}
