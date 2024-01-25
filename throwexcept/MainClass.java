package throwexcept;

public class MainClass {
	
	static void dept(String sha) throws FirstExcept,ScondExcept,ThirdExcept {
		try {
		
		if(sha.equals("first")) {
			throw new FirstExcept("First Exception");
		}
		else if (sha.equals("second")) {
			throw new ScondExcept("Second Exception");
		}
		
		else if(sha.equals("third")){
			throw new ThirdExcept("Third Exception");
		}
		
		}
		
	catch (Exception ex) {  
		throw ex;
	}
	
	}
/*	public static void school(String cla) throws ScondExcept {
		
		try {
			if(cla.equals("department")) {
				throw new ScondExcept("section exception");
				
			}
		}
		catch(Exception t) {
			throw t;
		}
		
	}*/

	private static void MainClass() {
	}
		public static void main(String[] args) {
			
			
			/*try {
				MainClass.school("department");
				System.out.println("");
			}
			catch(ScondExcept e) {
				System.out.println(e.getMessage());
				System.out.println("java application");
				System.out.println("");
				
			}*/
			
			
		try {
			
			MainClass.dept("first");
			System.out.println("");
		}
		catch(FirstExcept|ScondExcept|ThirdExcept e) {
			
			
			
			System.out.println(e.getMessage());
			
			System.out.println("programe finished");
			
		}

	}

}
