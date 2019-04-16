package createDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import exceptions.DBCreateException;

public class CreateDB {

	public static void main(String[] args) {
		
		
		String dbUrl="jdbc:derby://localhost:1527/dbCompany;create=true;";
		
		try (Connection con = DriverManager.getConnection(dbUrl);) {
			System.out.println("Connected to " + dbUrl);
		} catch (DBCreateException e) {
			e.error();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		System.out.println("Disconnected");

		
		
	}

}
