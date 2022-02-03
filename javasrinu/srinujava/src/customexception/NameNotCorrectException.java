package customexception;

public class NameNotCorrectException extends RuntimeException  {

	public NameNotCorrectException(String message) {
		super(message);
	}
}
