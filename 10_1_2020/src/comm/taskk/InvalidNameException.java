package comm.taskk;

public class InvalidNameException extends Exception {
private String message;
public InvalidNameException(String message) {
	super();
	this.message = message;
}
}
