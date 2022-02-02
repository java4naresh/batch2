package customeexception;

public class NameNotCorrectException extends RuntimeException {
	
	public NameNotCorrectException(String message) {
		super(message);
	}

}
