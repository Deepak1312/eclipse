abstract class Bank1
{
	abstract float getRateofIntrest();
	
    void display()	
    {
		System.out.println("Abstract class");
    }
}
    	
    	class SBI1 extends Bank
{

			@Override
			float getRateofIntrest() {
				return 0;
			}
	
}
class BOI extends Bank
	{	
		float getRateofIntrest()
		{
			return 6.8f;
		}
	}
class BOB extends Bank
{
	float getRateofIntrest()
	{
		return 6.9f;
	}
}
	
public class AbstractionDemo {

	public static void main(String[] args) {
		SBI obj=new SBI();
		System.out.println(obj.getRateofIntrest());
		
		Bank obj1=new ICICI();
		System.out.println(obj1.getRateofIntrest());

	}

}

