package Practice;

public class ArrayClass {

	int summ(int [] nums)
	{
		int sum=0;

		for(int n:nums)
		{
			sum+=n;
		}
		return sum;
	}
	
	

	private double averageMethod(int [] array)
	{
		double average=0;
		double sum=0; 
		for(int element: array)
		{
			sum+=element;
			 average= sum/array.length;
		}
		
		return average;
	}
	
	
	
	
	protected int sum(int [] array)
	{
		int sum=0;
		
		for(int element: array)
		{
			sum+=element;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
	ArrayClass a1= new ArrayClass();
	
	int [] array= {4888,6,3,2,3,5};
	double print= a1.averageMethod(array);
	System.out.println(print);
		
	
	int print2= a1.sum(array);
	System.out.println(print2);
	}
	
}
