package Practice;

public class p5 {
public static void main(String[] args) {
	
	
	
	//Create an array of integers and calculate the sum of all elements in
	//the array.
	
	int [] nums = {1,1,1,1,1};
	
	int sum=0;
	for(int n=0; n<nums.length; n++)
	{
		sum=sum + nums[n];
		
	}
	System.out.println("sum is " + sum);
	
	//Create an array of countries. While retrieving all values from the array
	//print the capital city for each country.
	
	String country[] = {"iran","turkey","uk"};
	for(int c=0; c<country.length;c++)
	{
		if(country[c].equalsIgnoreCase("iran"))
		{
			System.out.println(country[c] + " - Tehran");
		}
		else if(country[c].equalsIgnoreCase("turkey"))
		{
			System.out.println(country[c] + " - Istanbul");
		}
		else if(country[c].equalsIgnoreCase("uk"))
		{
			System.out.println(country[c] + " - England");
		}

		
	}
	
	
	
}
}
