package generics;

public class GenericMethodTest {
	
	public<E>void displayArrayElement(E[] elements)
	{
		for(E element:elements)
		{
			System.out.println("elements is: "+element);
		}
	}

	public static void main(String[] args) {
	
		GenericMethodTest obj=new GenericMethodTest();
		Integer[] intarray= {10, 20, 30, 40};
		String[] str= {"java", "programing", "learning"};
		
		obj.displayArrayElement(intarray);
		obj.displayArrayElement(str);

	}

}
