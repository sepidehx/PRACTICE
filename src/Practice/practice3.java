package Practice;

import java.util.Scanner;

public class practice3 {
public static void main(String[] args) {
	
	
	
	
	//Print numbers from 1 to 100 in 1 line with space
	
	for(int a=1; a<=100; a++ )
	{
		System.out.print(a + " ");
	}
	System.out.println();
	
	
	for(int a=20; a>=0; a--)
	{
		if(a%2==0)
		{
			System.out.print(a + " ");
		}
	}
	System.out.println();

	
	for(int a=20; a<50; a++)
	{
		if(a%2==1)
		{
			System.out.print(a + " ");
		}
	}
	System.out.println();
	
	for(int a=1; a<=32; a++)
	{
		if(a%2==0)
		{
			System.out.println(a + " is even");
		}else if(a%2==1)
		{
			System.out.println(a + " is odd");
		}
	}
	
	//Print numbers from 1 to 50 except those that are divisible by 3.
	
	for(int a=1; a<=50; a++)
	{
		if(a%3==0)
		{
			continue;
		}else
		{
			System.out.println(a + " ");
		}
	}
	
	
	//Create a program that will be asking the user to apply for a credit card 10 times. As

	//soon you get a “yes” from the user program should stop asking.
	
	
	Scanner scan= new Scanner(System.in);
	
	for(int a=1; a<=3; a++)
	{
		System.out.println("would you like to apply for a credit card?");
		boolean card=scan.nextBoolean();
		if(card==true)
		{
			System.out.println("thank you applying for credit card");
			break;
		}
	}
	
	//Write a program that reads a range of integers (start and end
	//point), provided by a user and then from that range prints the sum
	//of the even and odd integers.
	
	int sumodd=0;
	int sumeven=0;
	
	System.out.println("write a range of numbers");
	int num=scan.nextInt();
	if(num%2==0)
	{
		sumeven= num + sumeven;
	}else if(num%2==1)
	{
		sumodd= num + sumodd;
	}
	System.out.println("sum of even numbers is " + sumeven);
	System.out.println("sum of odd numbers is " + sumodd);

	
}
}
