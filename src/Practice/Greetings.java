package Practice;

public class Greetings {


//Create a method that will take 2 parameters as numbers and prints which number is larger.
	
	public void large(int a, int b)
	{
		if (a>b)
		{
			System.out.println(a + " is largest number");
		}else if(b>a)
		{
			System.out.println(b + " is largest number");
		}
	}
	
	public void oddOrEven(int num)
	{
		if(num%2==0)
		{
			System.out.println(num + " is even");
		}else if(num%2==1)
		{
			System.out.println(num + " is odd");
		}
	}
	
	public void language(String country)
	{
		if(country.equalsIgnoreCase("iran"))
		{
			System.out.println("salam");
		}else if(country.equalsIgnoreCase("uk"))
		{
			System.out.println("Hello");
		}else if(country.equalsIgnoreCase("South America"))
		{
			System.out.println("Hello");
		}
	}
	
	public int add() {
		int a=45;
		int b= 50;
		int c= a + b;
		return c;
	}
	
	
	
	public static void main(String[] args) {
		
		Greetings num= new Greetings();
		num.large(34, 50);
		
		num.oddOrEven(34);
		
		num.language("iran");
		
		int x = num.add();
		System.out.println(x);
		
		
	}

}
