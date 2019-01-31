

import java.sql.*;
public class Dbconnect 
{
    private Connection connection;
	
	
	
		


		public Connection getConnection()
		{
			try{  
				Class.forName("com.mysql.jdbc.Driver");  
				connection=DriverManager.getConnection(  
				"jdbc:mysql://10.0.21.62 :3306/Shipment","root","52Shivam@");  
				}catch(Exception e){ System.out.println(e);} 
			return this.connection;
		}

		public void closeConnection()
		{	
			try {
				this.connection.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
		
		}

}		