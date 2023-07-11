package apractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;


public class InsertDataIntoDataBase {

	public static void main(String[] args) throws SQLException {
		
		
		Connection con=null;
		try {
			Driver driverref=new Driver();
			DriverManager.registerDriver(driverref);
			con=DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
			Statement stmt=con.createStatement();
			
			String query="insert into project values('TY_PROJ_2050','SOUMYA','29/06/2023','TYSS','INPROGRESS','5')";
			int result=stmt.executeUpdate(query);
			
			if(result==1)
			{
				System.out.println("data is created");
			}
			else {
				System.out.println("data is not created");
			}
			
		} finally {
			con.close();
		}

	}

}
