package customers_vs_cupons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import exceptions.TableCreateException;

public class CreateTables {

	public static void main(String[] args) {

		String url = "jdbc:derby://localhost:1527/dbCompany";
		try (Connection con = DriverManager.getConnection(url + ";create=true");
				Statement stmt = con.createStatement();) {
			String sqlCreateTable = "create table customers_vs_cupons(customer_id INTEGER PRIMARY KEY"
					+ " REFERENCES customers(id), "
					+ "cupon_id INTEGER PRIMARY KEY REFERENCES copunes(id))";
			System.out.println("Table created");
		} catch (TableCreateException e) {
			e.error("customers_vs_cupones");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	} 
	
	}
