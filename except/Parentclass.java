package except;

public class Parentclass {
	
	public  int value() throws Exception {
		
		int a=10;
		if(a<=15) {
			System.out.println("allowed");
			throw new Exception("not allowed");
		}
		return a;
	}
	
	public static void find() throws Exception {
		
		System.out.println("Throw Arithmatic Exception");
		throw new Exception("trows parantclass");
	}

	public static void main(String[] args) {
		
		Parentclass obj=new Parentclass();
		
	
		try {
			obj.value();
			//find();
			
			
		}
		catch(Exception e) {
		System.out.println(e);
		}
		finally {
			System.out.println("exception handle or unhandle excute the finally");
		}


}		
}		
		
		
		
		
		
		