package company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import exceptions.TableCreateException;

public class CreateTables {

	public static void main(String[] args) {

		String url = "jdbc:derby://localhost:1527/dbCompany";
		try (Connection con = DriverManager.getConnection(url + ";create=true");
			Statement stmt = con.createStatement();)
		{
			String sqlCreateTable="create table companies(id INTEGER PRIMARY KEY"
					+ " GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) ,"
					+ " name VARCHAR(30),  email VARCHAR(35), password VARCHAR(15)";
			System.out.println("Table created");
		} catch (TableCreateException e) {
			e.error("companies");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	}

}
