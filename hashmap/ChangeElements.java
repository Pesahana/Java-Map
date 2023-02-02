package hashmap;

import java.util.HashMap;

class ChangeElements {

	 public static void main(String[] args) {

		    HashMap<Integer, String> languages = new HashMap<>();
		    
		    languages.put(1, "Java");
		    languages.put(2, "Python");
		    languages.put(3, "JavaScript");
		    
		    System.out.println("Original HashMap: " + languages);

		    
		    languages.replace(2, "C++");
		    
		    System.out.println("HashMap using replace(): " + languages);
		  }
	 
}
