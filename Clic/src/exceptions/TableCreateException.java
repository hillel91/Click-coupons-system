package exceptions;

import java.sql.SQLException;
/**
 * @see SQLExcepetion
 */
public class TableCreateException extends SQLException {

	/**
	 * 
	 * @param tableName, the name of the table that was not created
	 * @return String which display that the table creating has been failed
	 */
	public String error(String tableName) {
		return "Creating table, named " + tableName + "is failed. Please try later";
	}
	
}
