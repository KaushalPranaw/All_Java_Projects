package exec;

@SuppressWarnings("serial")
public class EmpAlreadyExistException extends Exception {

	public EmpAlreadyExistException(String msg) {
		super(msg);
	}
}
