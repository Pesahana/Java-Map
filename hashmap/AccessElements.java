package hashmap;

import java.util.HashMap;

class AccessElements {
 
	public static void main(String args[]) {
		
		HashMap<Integer, String> languages = new HashMap<>();
		
	    languages.put(1, "Java");
	    languages.put(2, "Python");
	    languages.put(3, "JavaScript");
	    System.out.println("HashMap: " + languages);

	    
	    String value = languages.get(1);
	    System.out.println("Value at index 1: " + value);
		
	}
}