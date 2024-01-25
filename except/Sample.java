package except;

public class Sample {
	
	public static void name() throws Exception {
		String ne="java";
		System.out.println(ne.charAt(10));
		throw new Exception("throw the exception");
	}
	

	public static void main(String[] args) {
		Sample obj=new Sample();
		try {
			obj.name();
		}
		catch(Exception e) {
			System.out.println("rest of code");
		}
		finally {
			System.out.println("java programming");
		}
		
		
		

	}

}
