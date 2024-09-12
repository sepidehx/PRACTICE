package Practice;

public class pattern1 {
public static void main(String[] args) {
	
	
	for(int a=1; a<6; a++)
	{
		for (int b=0; b<a; b++) //here b needs to be 0 because if 1, then number 1 will not e printed
		{
			System.out.print(a);
		}
		System.out.println();
	}
	
	////////////////////////////////////
	
	for (int row=5; row>0; row--)
	{
		for(int collumn=0; collumn<row; collumn++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	//1st iteration:
	//row =5 collumn=0 ---> from 0 to 5 ---> 5 iterations 
	//2nd iteration:
	//row=4  collumn=0 ---> from 0 to 4 ---> 4 iterations
	//3rd iteration:
	//row=4 collumn=0 ----> from 0 to 3 ---> 3 iterations 
	// collumn willalways remain 0 because we wrote collumn to equals to 0 and depend on row as well
	
	
	
	
	
	
	
	
}
}
