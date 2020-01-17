package exec;

import java.util.InputMismatchException;

@SuppressWarnings("serial")
public class CustomerIOExec extends InputMismatchException {

	public CustomerIOExec(String msg) {
		super(msg);
	}
}
