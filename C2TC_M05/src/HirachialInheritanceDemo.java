class Base 
{
	static int i;
	
	static void m1()
	{
		i=10;
		System.out.println("Hi in a base class");
	}
}
class Derived1 extends Base 
{
	int j;
	void m2()
	{
		System.out.println("Hi in a derived1 class");
	
	}
}
class Derived2 extends Base 
{
	int j;
	void m2()
	{
		System.out.println("Hi in a derived2 class");
	}
}
class Derived3 extends Base 
{
	int j;
	void m2()
	{
		System.out.println("Hi in a derived3 class");
	}
}
class Derived4 extends Base 
{
	int j;
	void m2()
	{
		System.out.println("Hi in a derived4 class");
	}
}
public class HirachialInheritanceDemo {

	public static void main(String[] args) {
	Derived1 obj=new Derived1();
	Base.m1();
	obj.m2();
	Base.m1();
	obj.m2();
	}

}
