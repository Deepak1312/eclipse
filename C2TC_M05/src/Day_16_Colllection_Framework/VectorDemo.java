package Day_16_Colllection_Framework;

import java.util.Enumeration;
import java.util.Vector;

class Student2 {
	
	int id;
	String name;
	int gread;
	
	public Student2(int id, String name, int gread)
	{
		this.id =id;
		this.name =name;
		this.gread =gread;
		
	}

	public String toString() {
		String str="Student2 [" + id + ", " + name + ", " + gread + "]";
		return str;
	}
	
}

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Object> v= new Vector<Object>();
		Student2 s1= new Student2(101, "Harry", 10);
		Student2 s2= new Student2(102, "Potter", 10);
		v.addElement(s2);
		v.addElement(s1);
		v.addElement("999");
		v.addElement("999");
		v.addElement(new String("999"));
		
		Enumeration<Object> e=v.elements();
		while(e.hasMoreElements());
		{
			Object o=e.nextElement();
			System.out.println(o);
		}
		

	}

}
