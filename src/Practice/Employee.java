package Practice;

public class Employee {

	/*
	 * Create a Class called Employee:

Create three variables: eID, salary and set the CEO to "Elion"

CEO should be a static variable

Create a method printInfo() that prints out the eID, salary and CEO of the object

Create two objects of the class Employee

Set the value of eID, salary for each of the objects

Call the printInfo() method for both objects

Change the CEO to "Bill Gates"

Call the printInfo() method for both objects
	 */
	
	int eID;
	int salary;
	static String ceo="Elion";
	
	public void printInfo()
	{
		System.out.println("id= " + eID + ", salary= " + salary + ", CEO= " + ceo);
	}
	
	public static void main(String[] args) {
		
		Employee emp1= new Employee();
		Employee emp2= new Employee();
		
		emp1.eID=1234;
		emp1.salary=100000;
		
		emp2.eID=5678;
		emp2.salary=2000000;
		
		emp1.printInfo();
		emp2.printInfo();
		
		Employee.ceo="Sepideh";
		
		emp1.printInfo();
		emp2.printInfo();

		
	}
	
}
