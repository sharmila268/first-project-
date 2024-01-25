package except;

public class Start {

	public static void main(String[] args) {
		
		try {
			
			String name=null;
			int a=20, b=0;
			
			int c=a/b;
			System.out.println(a);
			System.out.println(name);
		System.out.println("runtime errors");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmatic Exception");
		}
		catch(NullPointerException e) {
			System.out.println("nullpointer Exception");
			}
		catch(ClassCastException e) {
			System.out.println("class cast Exception");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Arrayindexofbounds Exception");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexoutofbounds Exception");
		}
		catch(Exception e) {
			System.out.println("handle the exception");
		}
		finally {
			System.out.println();
		}
	}

}
