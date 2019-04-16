package exceptions;

import java.sql.SQLException;

/**
 * @see SQLExcepetion
 */
public class DBCreateException extends SQLException {

	public String error() {
		return "Creating database is failed. Please try later";
	}

}
