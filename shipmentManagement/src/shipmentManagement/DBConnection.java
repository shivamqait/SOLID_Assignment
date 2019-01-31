package shipmentManagement;

import java.sql.*;
public class DBConnection 
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
public static void main(String args[])
{
	DBConnection db = new DBConnection();
	Connection con2 = db.getConnection();
	//here sonoo is database name, root is username and password  
	
	try {
		Statement stmt = con2.createStatement();
		ResultSet rs=stmt.executeQuery("select * from product");
		while(rs.next())
		System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3)+ " " + rs.getString(4));
	} catch (SQLException e) {
		System.out.println(e);
		
	}  
	
}

}		