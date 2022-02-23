class Bank
{
	float getRateofIntrest()
	{
		return 6.7f;
	}
}
class SBI extends Bank
{
	float getRateofIntrest()
{
	return 7.0f;
}
}
class HDFC extends Bank
	{	
		float getRateofIntrest()
		{
			return 6.8f;
		}
	}
class ICICI extends Bank
{
	float getRateofIntrest()
	{
		return 6.9f;
	}
}
	
public class MethodOverridingDemo {

	public static void main(String[] args) {
		SBI obj=new SBI();
		System.out.println(obj.getRateofIntrest());
		
		Bank obj1=new ICICI();
		System.out.println(obj1.getRateofIntrest());

	}

}
