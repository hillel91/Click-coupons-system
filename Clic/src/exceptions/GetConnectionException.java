package exceptions;

public class GetConnectionException extends InterruptedException {

	/**
	 * @return String which display that the table creating has been failed
	 */
	public String error() {
		return "Can't connect to the database. Please try later";
	}
	 
	private static final long serialVersionUID = 1L;

}
