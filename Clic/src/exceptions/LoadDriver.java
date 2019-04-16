package exceptions;

public class LoadDriver extends Exception {

	/**
	 * @author hbpe9
	 */
	private static final long serialVersionUID = 1L;

	public String error() {
		return "Loading driver failed. Please try later";
	}
}
