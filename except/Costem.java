package except;

public class Costem extends Exception {
	
	public static void check() throws ArithmeticException {
		
        System.out.println("Throw the Exception");
        throw new ArithmeticException("demo");
    }
    public static void main(String args[]) {
        try {
            check();
        } catch (ArithmeticException e) {
            System.out.println(e);
            e.printStackTrace();
            
          
      }  }
    
	
	
	
	
	
	
	

}
