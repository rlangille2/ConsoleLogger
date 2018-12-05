package app;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleScanner implements ConsoleSubject {
	
	private ArrayList observerList;
	private Scanner scanner;
	private String input;
	public ConsoleScanner() {
		
		input = "";
		Scanner scanner = new Scanner(System.in);
			while (scanner.hasNextLine()) {
				input = scanner.nextLine();
				if(!input.equals("Exit")){
					System.out.println(input);
					} else {
						System.out.println("Application Closed");
						System.exit(0);
					}
				
				}
			}

	public void addObserver(ConsolePrinter consolePrinter) {
		observerList.add(consolePrinter);
	}

	public void removeObserver(ConsolePrinter consolePrinter) {
		observerList.remove(consolePrinter);
	}
	
	public int getNumberOfObservers() {
		return observerList.size();
	}
}
