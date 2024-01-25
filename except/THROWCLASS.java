package except;

public class THROWCLASS {
	
	public static void divid() throws Exception{
		
		for(int a=1; a<=10; a++) {
			System.out.println("looping");
		}
		String name="java";
		System.out.println(name.codePointAt(10));
		throw new Exception("throw the exception");
	}
	
	public static void main(String[] args) {
		try {
			divid();
		}
		catch(Exception x) {
			System.out.println(x);
		}

	}

}
