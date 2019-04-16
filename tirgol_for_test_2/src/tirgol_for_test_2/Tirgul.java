package tirgol_for_test_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Tirgul {

	public static void main(String[] args) {

		double a = 2.1;
		short b = 4;
		final int c;
		System.out.println(b);
		c=9;
		System.out.println(c);
		
		try {
			String driverName = "org.apache.derby.jdbc.ClientDriver";
			Class.forName(driverName);					// טעינת הדרייבר
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String url = "'jdbc:derby://localhost:1527/db1;create=true';";
		try ( // ARM resources:
			Connection con = DriverManager.getConnection(url);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from orders");

		) {
			// go over the result set
			int counter=0;
			while (rs.next()) {
				counter+=1;
				/*int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println(id + ", " + name + ", " + age);*/
			}
		} catch (SQLException e) {
		e.printStackTrace();
		}

		
	}

}
