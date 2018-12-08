package app;

import java.util.Scanner;

public class ScannerController {
	
	private boolean isRunning = false;
	private Scanner scanner = new Scanner(System.in);
	
	public ScannerController() {
		
	}
	
	public void start() {
		this.isRunning = true;
		ask(AskBool, "Key in one of the options and hit enter. Do you understand? [Y/N]");
	}
	
	public void ask(Class Queryable, String question) {
		System.out.println(question);
		System.out.print("> ");
		scanner.hasNextLine();
		String input = scanner.nextLine();
		query(queryable, input);
	}
	
	public void query(Queryable queryable, String input) {
		System.out.println("input was: " + input);
	}

}
