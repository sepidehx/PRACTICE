package Practice;

public class P1DigitalClock {
public static void main(String[] args) {
	
	
	
	//digital clock
	
	for (int hour=0; hour<24; hour++)
	
	{
		for (int min=0; min<60; min++)
		{
			//What situation do i see here
			// when hour<10 and min < 10 it shows ---> 1:1
			//but we want it to be 01:01
			if(hour<10 && min<10)
			{
				System.out.println("0" + hour + ":" + "0" + min);
			}
			//2. when hour <10 and min>=10
			else if (hour<10 && min>=10)
			{
				System.out.println("0" + hour + ":" + min);
			}
			//3. when hour is more or equal to 10 and min is less than 10
			else if (hour>=10 && min <10)
			{
				System.out.println(hour + ":" + "0" + min);
			}
			else //both the hours and mins are more and equal to 10
			{
				System.out.println(hour + ":" + min);
		
			}
			
			
			
			
			
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
