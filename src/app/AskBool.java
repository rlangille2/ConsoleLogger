package app;

import java.util.HashMap;

public class AskBool implements Queryable{
	private Boolean bool;
	private static HashMap<String, Boolean> boolMap = new HashMap<>();
	static {
		boolMap.put("Y", true);
		boolMap.put("Yes", true);
		boolMap.put("T", true);
		boolMap.put("True", true);
		boolMap.put("1", true);
		boolMap.put("N", false);
		boolMap.put("No", false);
		boolMap.put("F", false);
		boolMap.put("F", false);
		boolMap.put("0", false);		
	}
	
	
	public void ask(String input) {
		bool = inputIsValid(input);
		if(!bool) {
			printError();
		} else {
			System.out.println(boolMap.get(input));	
		}
	}
	
	private Boolean inputIsValid(String input) {
		return boolMap.containsKey(input);
	}
	
	private void printError() {
		System.out.println("input invalid");
	}


}