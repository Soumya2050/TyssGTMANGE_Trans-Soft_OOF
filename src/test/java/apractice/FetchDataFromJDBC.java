package apractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class FetchDataFromJDBC {

	@Test
	public void fetchDataFromDB() throws SQLException {
		Connection con = null;
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "soumya");
			Statement stm = con.createStatement();
			String query = "select * from emp";

			ResultSet result = stm.executeQuery(query);

			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2));
			}

		} catch (SQLException e) {

			con.close();
		}

	}
	@Test
	public void writeDataFromDb() {
		Connection con;
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			con = DriverManager.getConnection(null);
			Statement stm = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
