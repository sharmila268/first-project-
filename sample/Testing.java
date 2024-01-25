package sample;

public class Testing {

	public static void main(String[] args) {
		try {
			throw new MyException("newly joined");
		}
		catch(MyException f) {
			System.out.println("java ");
			System.out.println(f.getMessage());
		}

	}

}
