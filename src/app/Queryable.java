package app;

public interface Queryable {

	public void ask(String input);

	public Boolean isInputValid(String input);

	public void errorHandler();

}
