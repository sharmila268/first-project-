package langauge;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {
	 

	  ArrayList<String> Tec_languages = new ArrayList<>
	  
	  (Arrays.asList("Java", "Python", "JavaScript"));
	
	public void checklangauge(String language)throws CustomException {
		
		if(Tec_languages.contains(language)) {
			throw new CustomException(language+":Already Exists");
		}
		else {
			Tec_languages.add(language);
			System.out.println(language+":Add To Arraylist");
		}
		
	}

	public static void main(String[] args) {
		
		MainClass obj=new MainClass ();
		try {
		obj.checklangauge("html");
		obj.checklangauge("sql");
		}
		  catch(CustomException e) {
		      System.out.println("[" + e + "] Exception Occured");
		    }
	}
		


}