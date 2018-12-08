package app;

import java.util.Scanner;

public class ScannerController {
	
	private boolean isRunning = false;
	private Scanner scanner = new Scanner(System.in);
	
	public ScannerController() {
		
	}
	
	public void start() {
		this.isRunning = true;
		ask(new AskBool(), "Key in one of the options and hit enter. Do you understand? [Y/N]");
	}
	
	public void ask(Queryable queryable, String question) {
		System.out.println(question);
		System.out.print("> ");
		scanner.hasNextLine();
		String input = scanner.nextLine();
		query(queryable, input);
	}
	
	public void query(Queryable queryable, String input) {
		queryable.ask(input);
	}

}
