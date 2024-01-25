package vowels;

public class FINDNO extends Exception{
	
	public static void main(String[] args) {
	    int n = 11;
	    checknumber(n);
	    n = 712;
	    checknumber(n);
	  }

	 public static void checknumber(int n) {
		    try {
		      checkEvenNumber(n);
		      System.out.println(n + " is Even No.");
		    } catch (IllegalArgumentException e) {
		      System.out.println("THE NO: " + e.getMessage());
		    }
		  }

		  public static void checkEvenNumber(int number) {
		    if (number % 2 != 0) {
		      throw new IllegalArgumentException(number + " is odd.");
		    }
		  }
}
