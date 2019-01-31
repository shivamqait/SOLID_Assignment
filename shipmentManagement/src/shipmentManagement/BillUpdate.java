package shipmentManagement;

import java.sql.*;

public class BillUpdate {
	public static void main(String args[])
	{
		DBConnection db = new DBConnection();
		Connection con2 = db.getConnection();
		
		CheckOut c = new CheckOut();
		int s = c.total();
		try {
			Statement stmt = con2.createStatement();
			String query = "insert into billing values (?, ?)";
			
			PreparedStatement preparedStatement = con2.prepareStatement(query);
			preparedStatement.setString(1, "Aman");
			preparedStatement.setInt(2, s);
			preparedStatement.executeUpdate(); 

			} catch (SQLException e) {
			System.out.println(e);
			
		}  
		db.closeConnection();
		
	}
}
