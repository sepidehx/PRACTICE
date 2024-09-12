package Practice;

public class practice4 {

	public static void main(String[] args) {

		String str = "This Is Test";
		char[] charArray = str.toCharArray();

		for (char output : charArray) {
			System.out.print(output);
		}
		System.out.println();
		
		
		String subject = "I love Java and I want to learn more";

		//Using space " " as a delimiter

		//Split returns an array of Strings
		String[] splittedSub = subject.split(" ");

		System.out.println(splittedSub.length);

		// Looping through the array to get all the values
		for (int i = 0; i < splittedSub.length; i++) {

		System.out.print(splittedSub[i]);

		}

	}}
