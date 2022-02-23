package generics;

public class GenericConstructors {
private double v;
public <T extends Number>GenericConstructors(T t)
{
	v=t.doubleValue();
	}
void show()

	{
		System.out.println("Value of v is: "+v);
				
	}
	public static void main(String[] args) {
		System.out.println("Number to Double Conversation:");
		GenericConstructors obj=new GenericConstructors(10);
		obj.show();
		
		GenericConstructors obj1=new GenericConstructors(136.8F);
		obj1.show();
		
	
		

	}

}
