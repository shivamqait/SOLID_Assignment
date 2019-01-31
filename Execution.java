import java.sql.*;
class Execution 
{ 
    public static void main(String[] args)  
    { 
        Product model  = result();
  
        Shipmentview view = new Shipmentview(); 
  
        Getproduct controller = new Getproduct(model, view); 
  
        controller.updateView();
       
        


    }

   private static Product result() 
    {
        Product p1 = new Product(); 
        Dbconnect db = new Dbconnect();
        Connection con = db.getConnection();
        try{  
//        Class.forName("com.mysql.jdbc.Driver");
   //     Connection con = DriverManager.getConnection("jdbc:mysql://10.0.21.62 :3306/Shipment", "root", "52Shivam@");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select Pname,Pprice,Pquantity from product where Pcategory='Fruit'");
        String Pname = rs.getString("Pname");
        int Pprice = rs.getInt("Pprice");
        int Pquantity = rs.getInt("Pquantity");
      
       
        p1.setName(Pname); 
        p1.setPrice(Pprice); 
        p1.setQty(Pquantity);
        
     db.closeConnection();  
    }catch(Exception e){ System.out.println(e);} 
    return p1;
}
}