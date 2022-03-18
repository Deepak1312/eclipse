package Practice;

public class ArrayRotation {
	
	public static void main(String[] args)
	{
		int[] arr=new int[] {10,20,30,40,50};
		int n=3;
		System.out.println("Array elements before right rotation......");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println("rotating array 2 time");
		
		for(int i=0;i<n;i++)
		{
			int j,first;
			first=arr[0];
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=first;

			
		}
		
		System.out.println("-----------------");
		System.out.println("Array elements after right rotation......");
		for(int a:arr)
		{
			System.out.print(" "+a);
		}

	}

}
