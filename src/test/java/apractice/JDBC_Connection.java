package apractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class JDBC_Connection {

	@Test
	public void readTheDataFromDB() throws SQLException {
		// TODO Auto-generated method stub

		Driver driverref = new Driver();
		DriverManager.registerDriver(driverref);

		Connection con = DriverManager.getConnection("URL", "UserName", "Password");

		Statement st = con.createStatement();

		String query = "Select * from table";

		ResultSet result = st.executeQuery(query);

		while (result.next()) {
			System.out.println(result.getInt(0) + result.getString(1));
		}
		con.close();

	}
	
	
	@Test
	public void updateTheDataIntoDB() throws SQLException {
		
		Driver driver=new Driver();
		
		DriverManager.registerDriver(driver);
		
		Connection con=DriverManager.getConnection("URL","username","Password");
		
		Statement st=con.createStatement();
		
		String query = "insert into table (field1,field2,field3) values (1,2,3)";
		
		int result = st.executeUpdate(query);
		
		if(result ==1) {
			System.out.println("query update successfully");
		}else {
			System.out.println("query not update successfully");
		}
		
		con.close();
	}

}
