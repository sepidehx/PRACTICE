package Practice;

public class Email {

	public String createEmail(String first, String last, String email)
	{
		String fullemail= first + last + "@" + email;
		return fullemail;
	}
	
	
	
	public static void main(String[] args) {
		
		Email email= new Email();
		String fullEmail= email.createEmail("sepideh", "_fattahi", "gmail.com");
				
		System.out.println(fullEmail);
		
		
	}
}


