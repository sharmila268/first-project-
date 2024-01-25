package except;

public class Practise {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		try {
		    int x = numbers[10];
		    System.out.println(x);
		} catch (Exception e) {
		    System.out.println("Array Exception");
		}
		
		
		
	/*	System.out.println("shandhoshni");
		
		try {
			double f=10.5/3;
			System.out.println(f);
			//String name=null;
			//System.out.println(name.charAt(5));
			
		}
		catch(Exception ex) {
			System.out.println("Exception");
		}
		System.out.println("elango");
		System.out.println("sharmila");*/

	}

}
