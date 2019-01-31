package shipmentManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = {"Apple", "Orange"};
		double[] pr = {50, 60};
		int[] q = {2, 3};
		Item[] i = new Item[2];
		for(int j = 0; j < 2; j++)
		{
			i[j] = new Item();
			i[j].setName(name[j]);
			i[j].setPrice(pr[j]);
			i[j].setQty(q[j]);
		}
		
		DBConnection db = new DBConnection();
		Connection con2 = db.getConnection();
		
		
		CheckOut c = new CheckOut(i);
		int s = c.total();
		
		System.out.println(s);
		
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
