package Practice;

import java.util.Scanner;
//
public class p2 {
	public static void main(String[] args) {
//		
//		Scanner scan= new Scanner(System.in);	
////		System.out.println("what time is it");
////		int hour= scan.nextInt();
////		
////		if (hour<12)
////		{
////			System.out.println("good morning");
//		}else if(hour>=12 && hour<15)
//		{
//			System.out.println("good afternoon");
//		}else if( hour>=15 )
//		{
//			System.out.println("good evening ");
//		}
//		
//		System.out.println("what is the temperature");
//		int temp=scan.nextInt();
//		
//		if(temp<32)
//		{
//			System.out.println("water will freeze with temperature" + temp);
//		}else {
//			System.out.println("water will not freeze with temperature " + temp );
//		}
//		
//		
//		System.out.println("hi do you have any alergies?");
//		boolean allergy= scan.nextBoolean();
//		if (allergy==false)
//		{
//			System.out.println("youre healthy");
//		}else if(allergy==true)
//		{
//		
//			System.out.println("what are you allergic to?");
//			String whatAllergy=scan.next();
//			if(whatAllergy.equalsIgnoreCase("peanut"))
//			{
//				System.out.println("don't eat " + whatAllergy);
//			}else if(whatAllergy.equalsIgnoreCase("lacose"))
//			{
//				System.out.println("don't eat " + whatAllergy);
//			}else if(whatAllergy.equalsIgnoreCase("bee"))
//			{
//				System.out.println("don't eat " + whatAllergy);
//			}else if (whatAllergy.equalsIgnoreCase("seafood"))
//			{
//				System.out.println("dont eat " + whatAllergy);
//			}
//		}
//		
//		
//		int num= scan.nextInt();
//		if(num%2==0)
//		{
//			System.out.println( num + " is even");
//		}else if (num%2==1)
//		{
//			System.out.println(num + " is odd");
//		}
//		

//		Create a Java program to check if it is Friday or not. If it is Friday, print "It's Friday. I am
//		going to watch a movie.” and check the date, if date is 13 print "I will watch a scary
//		movie.” If date is not 13 print "I will watch a comedy.” If it is not Friday, print "It is NOT
//		Friday. I am going to study JAVA.”


//		boolean friday= false;
//		int date= 13;
//		
//		if (friday==true)
//		{
//			System.out.println("i am going to watch a movie");
//			if(date==13)
//			{
//				System.out.println("i will watch a scary movie");
//			}else
//			{
//				System.out.println("i will watch a comedy movie");
//			}
//		}else
////		{
////			System.out.println("it is not friday i will have to study java");
////		}
////		
////		/*
//		 * ➔ Prompt the user to enter person heights in inches. Person should be classified as one of
//
//the following:
//
//◆ short (under 60 inch)
//
//◆ medium(between 60 -72 inch)
//
//◆ tall (over 72 inch)
//		 */
//		
//		System.out.println("how tall are you in inches");
//		int inch=scan.nextInt();
//		
//		if(inch<60 && inch>0)
//		{
//			System.out.println("short");
//		}else if (inch>60 && inch<=72)
//		{
//			System.out.println("medium");
//		}else if (inch>72)
//		{
//			System.out.println("tall");
//		}else
//		{
//			System.out.println("that is not in the range");
//		}

/*
 * Create a boolean variable workDay and assign true. Create an int variable day and

assign 1 to it.

◆ As long as it is workDay print “I need a day off” and increase the day.

◆ Once day is 6, print “I do not need a day off anymore” and assign false to workDay.
//		 */

		boolean workDay=true;
		int day=1;

		while(workDay==true)
		{
			if(day==6)
			{
				System.out.println("i do not need a day off anymore");
		workDay=false;
		break;
			}else
			{
				System.out.println("i need a day off");
			}
			day++;
			
		}
		
//		
//		Write a program that asks the user to enter his/her username
//
//		and password until the user enters them correctly.
		
		Scanner scan= new Scanner(System.in);
		
		
		String expectedUser="username";
		String expectedPass="password";
		
		String username;
		String password;
		
		System.out.println("what is your username and password?");
		
		 username=scan.next();
		 password=scan.next();
		
		while(!username.equalsIgnoreCase(expectedUser) && !password.equalsIgnoreCase(expectedPass))
		{

			System.out.println("wrong username and password please try again");
			 username=scan.next();
			 password=scan.next();

			
		}
		System.out.println("logged in succesfully");

		
		int num=0; int sum=0;
		
		while(num<=10)
		{
			if(num%2==0)
			{
				sum=sum+num;
			}
			num++;
		}
		System.out.println("sum of even numbers is " + sum);

		
		
}
}
