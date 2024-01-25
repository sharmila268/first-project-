
public class CustomException {
	
	
	public static void validate (int age) throws AgeinvalidException{
		
		if(age<18) {
			throw new AgeinvalidException("Your Age Is Not Valid For Vote");
		}
		else {
			System.out.println("Welcom To Vote");
		}
		
	}
			
	public static void main(String[] args) {
		
		try {
			validate(20);
		}
		catch(AgeinvalidException e) {
			System.out.println("The Exception");
		
			System.out.println("Exception Occured : "+e);
	}
		System.out.println("REST OF THE CODE");
	}
}
