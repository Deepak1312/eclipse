
public class Student {

	int id;
	String name;
	String course;
	String email;
	Student()
	{
	}
	
	public Student(int id, String name, String course, String email) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.email = email;
	}
     
	public void display()
	{
	System.out.println("Student information:");
	System.out.println(id+" "+name+" "+course+" "+email);
	}
	
	
	public static void main(String[] args) {
		

	}

}
