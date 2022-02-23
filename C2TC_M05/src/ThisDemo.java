class Animal
{
	int legs;
	String name;
	String color;
	
	public Animal()
	{
		System.out.println("This is default constructor");
	}
	public Animal(String name) {
		this();
		this.name = name;
	}
	
	public Animal(String name, String color) {
		this();
		this.color = color;
	}
	public Animal(int legs) {
		super();
		this.legs = legs;
	}
	void display()
	{
		System.out.println("Animal Decscription:");
		System.out.println(color+" "+"color"+" "+name+" "+"with"+" "+""+legs+" "+"legs");
	}
	
@Override
	public String toString() {
		return "Animal [legs=" + legs + ", name=" + name + ", color=" + color + "]";
	}

public class ThisDemo {

	public static void main(String[] args) {
		Animal obj1 = new Animal("Cat","White");
	    obj1.display();
	    Animal obj2 = new Animal("Dog","Black");
	    obj2.display();
	}
}
}
