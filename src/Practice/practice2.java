package Practice;

import java.util.Scanner;

public class practice2 {
public static void main(String[] args) {
	
	Scanner scan= new Scanner (System.in);
	System.out.println("please enter a number");
	int num=scan.nextInt();
	
	for(int i= 1; i<=num; i++)
	{
		//this loop should run once in the first row
		//this loop should run twice on the second row
		for(int j= 1; j<=i; j++)
		{
			System.out.print(j + " ");
		}
	
		
		System.out.println();
	}
	
	for(int i= num-1; i>=1; i--)
	{
		for(int j=1; j<=i; j++)
		{
			System.out.print(j +" ");
		}
		System.out.println();
	}
	/////////////////////////////////////////////
	System.out.println("please enter a number!");
	int user=scan.nextInt();
	
	for(int ii=1; ii<=user; ii++)
	{
		for(int jj=1; jj<=ii; jj++)
		{
			System.out.print(jj+" ");
		}
		System.out.println();
	}
	
	for(int ii=user-1; ii>=1; ii--)
	{
		for(int jj=1; jj<=ii; jj++)
		{
			System.out.print(jj + " ");
		}
		System.out.println();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
