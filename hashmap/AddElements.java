package hashmap;

import java.util.HashMap;

class AddElements {

	 public static void main(String[] args) {

		    
		    HashMap<String, Integer> numbers = new HashMap<>();

		    System.out.println("Initial HashMap: " + numbers);
		    
		    numbers.put("One", 1);
		    numbers.put("Two", 2);
		    numbers.put("Three", 3);
		    
		    System.out.println("HashMap after put(): " + numbers);
		    
		  }
}
